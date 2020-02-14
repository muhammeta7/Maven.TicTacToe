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
        if (checkDiagonals('X') || checkRows('X') || checkColumns('X') ) {
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean isInFavorOfO() {
        if (checkDiagonals('O') || checkRows('O') || checkColumns('O') ) {
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean isTie() {
        if( !isInFavorOfX() && !isInFavorOfO() ) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getWinner() {
        if ( isInFavorOfX()) {
            return "X";
        }
        else if( isInFavorOfO() ) {
            return "O";
        }
        else {
            return "";
        }
    }

    // Check Rows
    public boolean checkRows(Character player){
        for(int i = 0; i <= 2; i++){
            if ((board[i][0] == player) && (board[i][1] == player) && (board[i][2] == player)){
                return true;
            }
        }
        return false;
    }

    // Check Columns
    public boolean checkColumns(Character player){
        for(int i = 0; i <= 2; i++){
            if ((board[0][i] == player) && (board[1][i] == player) && (board[2][i] == player)){
                return true;
            }
        }
        return false;
    }

    // Check Both Diagonals
    public boolean checkDiagonals(Character player){
        if((board[0][0] == player && board[1][1] == player  && board[2][2] == player) ||
                (board[2][0] == player && board [1][1] == player && board[0][2] == player)) {
            return true;
        }
        return false;
    }

}













