package pl.tictactoe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TicTacToeTest {

    private TicTacToe ticTacToe;

    @BeforeEach
    void beforeAll() {
        ticTacToe = new TicTacToe();
    }

    @Test
    void board_should_have_dimensions_3x3_create_board_then_returns_board() {
        int[][] board = ticTacToe.getBoard();

        assertEquals(3, board[0].length);
        assertEquals(3, board[1].length);
        assertEquals(3, board[2].length);
    }

    @Test
    void given_created_board_when_the_game_starts_then_are_zeros() {
        int[][] board = ticTacToe.getBoard();
        assertEquals(3, board.length);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < i; j++) {
                assertEquals(0, board[i][j]);
            }
        }
    }

    @Test
    void given_create_board_when_game_starts_then_check_players_values() {
        int p1 = ticTacToe.getPlayerOneValue();
        int p2 = ticTacToe.getPlayerTwoValue();

        assertEquals(1, p1);
        assertEquals(2, p2);
    }

    @Test
    void given_player_one_when_put_mark_on_field_1_1_then_board_has_on_field_not_empty () {
        int p1 = ticTacToe.getPlayerOneValue();
        boolean isPossible = ticTacToe.put(1, 1, p1);

        assertFalse(isPossible);
    }

    @Test
    void given_player_one_when_put_mark_on_field_1_1_then_bord_has_on_field_0_0_value_1 () {

    }



    @Test
    void checkTheWinner() {
        assertFalse(true);
    }
}
