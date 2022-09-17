import Controller.FmssGame;
import User.User;
import database.Database;

public class Main {

    public static void main(String[] args) {
        User user = Database.users.get(1);

        FmssGame.playGame(user, Database.gameById(1));
    }
}
