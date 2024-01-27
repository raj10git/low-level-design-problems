package ChessGame;

public class Move {
    Player player;
    Piece piece;
    CellPosition fromPos;
    CellPosition toPos;

    public Move(Player player, Piece piece, CellPosition fromPos, CellPosition toPos) {
        this.player = player;
        this.piece = piece;
        this.fromPos = fromPos;
        this.toPos = toPos;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public CellPosition getFromPos() {
        return fromPos;
    }

    public void setFromPos(CellPosition fromPos) {
        this.fromPos = fromPos;
    }

    public CellPosition getToPos() {
        return toPos;
    }

    public void setToPos(CellPosition toPos) {
        this.toPos = toPos;
    }
}
