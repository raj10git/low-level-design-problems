package ChessGame;

public class Cell {
    Color color;
    Piece piece;
    CellPosition position;

    public Cell(CellPosition position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public CellPosition getPosition() {
        return position;
    }

    public void setPosition(CellPosition position) {
        this.position = position;
    }

}