package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        return null;
    }


    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {

        return null;
    }

    public String getWinner() {
        return null;
    }

    // Check Rows
    public boolean checkRows(Character xOrO){
        for(int i = 0; i <= 2; i++){
            if ((board[i][0] == xOrO) && (board[i][1] == xOrO) && (board[i][2] == xOrO)){
                return true;
            }
        }
        return false;
    }

    // Check Cols
    public boolean checkVertical(Character xOrO){
        for(int i = 0; i <= 2; i++){
            if ((board[0][i] == xOrO) && (board[1][i] == xOrO) && (board[2][i] == xOrO)){
                return true;
            }
        }
        return false;
    }

    // Check Both Diagonals
    public boolean checkDiagonals(Character xOrO){
        if ((board[0][0] == xOrO && board[1][1] == xOrO  && board[2][2] == xOrO) ||
                (board[2][0] == xOrO && board [1][1] == xOrO && board[0][2] == xOrO)){
            return true;
        }
        return false;
    }


















}













