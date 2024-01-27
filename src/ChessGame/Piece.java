package ChessGame;

public abstract class Piece{
    Color color;
    boolean isKilled;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    //public boolean move(CellPosition fromPosition, CellPosition toPosition);
    //public List<CellPosition> possibleMoves(CellPosition fromPosition);
    public abstract boolean isValidMove(CellPosition fromPosition, CellPosition toPosition);
}

class Pawn extends Piece{

    @Override
    public boolean isValidMove(CellPosition fromPosition, CellPosition toPosition) {
        return false;
    }
}

class King extends Piece{

    @Override
    public boolean isValidMove(CellPosition fromPosition, CellPosition toPosition) {
        return false;
    }
}

class Rook extends Piece{

    @Override
    public boolean isValidMove(CellPosition fromPosition, CellPosition toPosition) {
        return false;
    }
}

class Knight extends Piece{

    @Override
    public boolean isValidMove(CellPosition fromPosition, CellPosition toPosition) {
        return false;
    }
}

class Queen extends Piece{

    @Override
    public boolean isValidMove(CellPosition fromPosition, CellPosition toPosition) {
        return false;
    }
}

class Bishop extends Piece{

    @Override
    public boolean isValidMove(CellPosition fromPosition, CellPosition toPosition) {
        return false;
    }
}

