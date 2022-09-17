package User;

import game.Game;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private double walletBalance;

    Subscription subscription = new Subscription();

    public List<Game> library = new ArrayList<>();

    public User(int id, String name, double walletBalance, List<Game> library) {
        this.id = id;
        this.name = name;
        this.walletBalance = walletBalance;
        this.library = library;
    }

    public int getId() {
        return id;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public List<Game> getLibrary() {
        return library;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public boolean doYouHaveAGame(Game game) {
        return library.contains(game);
    }
}
