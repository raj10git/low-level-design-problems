package TicTacToe;

import org.jetbrains.annotations.NotNull;

public class Game {
    Board board;
    GameStatus gameStatus;
    Player[] players;

    public void startGame(Player p1, Player p2){
        players[0] = p1;
        players[1] = p2;

        board.startBoard();

        gameStatus = GameStatus.ACTIVE;
    }

    public boolean playerMove(@NotNull Spot spot, Symbol symbol){
        Symbol symbolAtCurrSpot = spot.getSymbol();
        if(symbolAtCurrSpot != null){
            return false;
        }
        board.updateBoard(spot, symbol);
        board.checkBoard(spot);
        return true;
    }

    public void changeTurn(Player[] players){

    }
}
