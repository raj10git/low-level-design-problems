package ChessGame;

import java.util.List;

public class Chess {
    Board board;
    Player currentPlayer;
    GameStatus gameStatus;
    List<Move> movesList;
    Player[] players;

    public void startGame(Player p1, Player p2){
        players[0] = p1;
        players[1] = p2;

        board.startBoard();
        p1.color = Color.randomColor();
        if(Color.WHITE.equals(p1.color)){
            p2.color = Color.BLACK;
        }else{
            p2.color = Color.WHITE;
        }
    }

    public boolean playerMove(CellPosition fromPos, CellPosition toPos, Piece piece){
        Cell source = new Cell(fromPos);
        Piece sourcePiece = source.getPiece();
        if(!sourcePiece.isValidMove(fromPos, toPos)){
            return false;
        }
        Cell dest = new Cell(toPos);
        Piece destPiece = dest.getPiece();
        if (destPiece != null){
            destPiece.setKilled(true);
        }
        dest.setPiece(sourcePiece);

        if(currentPlayer != null && fromPos != null && toPos != null) {
            Move move = new Move(currentPlayer, sourcePiece, fromPos, toPos);
            movesList.add(move);
        }
        return true;
    }
    private void changeTurn(){}
}