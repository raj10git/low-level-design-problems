package TicTacToe;

public class Board{
    Spot spot;
    Spot[][] spots;
    public void startBoard(){
        spots = new Spot[9][9];
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                spots[i][j] = null;
            }
        }
    }

    public void updateBoard(Spot spot, Symbol symbol){
        spot.setSymbol(symbol);
        spots[spot.getRow()][spot.getCol()] = spot;
    }
    public GameStatus checkBoard(Spot spot){
        int curRow = spot.getRow();
        int curCol = spot.getCol();
        Symbol curSymbol = spot.getSymbol();
        boolean isWin = false;

        if(curRow == curCol){
            if(curRow == 0){
                isWin = checkRow(curSymbol, 0) || checkCol(curSymbol, 0) || checkDiagonal(curSymbol);
            }else if(curRow == 2){
                isWin = checkRow(curSymbol, 0) || checkCol(curSymbol, 0) || checkRevDiag(curSymbol);
            }else if(curRow == 1){
                isWin = checkRow(curSymbol, 0) || checkCol(curSymbol, 0) || checkDiagonal(curSymbol) || checkRevDiag(curSymbol);
            }
        }else if(Math.abs(curRow-curCol) == 1){
            isWin = checkRow(curSymbol, curRow) || checkCol(curSymbol, curCol);
        }else{
            if(curRow == 2 && curCol == 0){
                isWin = checkRow(curSymbol, 0) || checkCol(curSymbol, 0) || checkDiagonal(curSymbol);
            }else{
                isWin = checkRow(curSymbol, 0) || checkCol(curSymbol, 0) || checkRevDiag(curSymbol);
            }
        }
        if(isWin){
            if(curSymbol == Symbol.O)
                return GameStatus.O_WON;
            else
                return GameStatus.X_WON;
        }
        return GameStatus.DRAW;
    }

    public boolean checkRow(Symbol symbol, int row){
        for(int i=0; i<3; i++){
            if(!symbol.equals(spots[row][i].getSymbol()))
                return false;
        }
        return true;
    }

    public boolean checkCol(Symbol symbol, int col){
        for(int i=0; i<3; i++){
            if(!symbol.equals(spots[i][col].getSymbol()))
                return false;
        }
        return true;
    }

    public boolean checkDiagonal(Symbol symbol){
        for(int i=0; i<3; i++){
            if(!symbol.equals(spots[i][i].getSymbol()))
                return false;
        }
        return true;
    }

    public boolean checkRevDiag(Symbol symbol){
        for(int i=0; i<3; i++){
            if(!symbol.equals(spots[i][2-i].getSymbol()))
                return false;
        }
        return true;
    }
}