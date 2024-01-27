package ChessGame;

import java.util.Random;

public class Player {
    Account account;
    Color color;
}

class Account{
    String username;
    String password;
}

enum Color{
    WHITE, BLACK;

    private static final Random RANDOM = new Random();

    public static Color randomColor()  {
        Color[] colors = values();
        return colors[RANDOM.nextInt(colors.length)];
    }
}