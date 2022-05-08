package pl.tictactoe;

public class TicTacToe {

    private final int PLAYER_ONE_VALUE = 1;
    private final int PLAYER_TWO_VALUE = 2;

    private int[][] board;

    public TicTacToe() {
        createBoard();
    }

    private void createBoard() {
        board = new int[3][3];
    }

    public int[][] getBoard() {
        return board;
    }

    public int getPlayerOneValue() {
        return PLAYER_ONE_VALUE;
    }

    public int getPlayerTwoValue() {
        return PLAYER_TWO_VALUE;
    }

    public boolean put(int x, int y, int playerValue) {
        int boardX = x - 1;
        int boardY = y - 1;

        int value = board[boardX][boardY];
        if (value == 0) {
            board[boardX][boardY] = playerValue;
            return true;
        }
        return false;
    }
}
