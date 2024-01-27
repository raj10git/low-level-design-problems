package TicTacToe;

import java.util.Random;

public enum Symbol {
    O, X;

    private static final Random RANDOMSYMBOL = new Random();

    public static Symbol getRandom(){
        Symbol[] symbols = values();
        return symbols[RANDOMSYMBOL.nextInt(values().length)];
    }
}
