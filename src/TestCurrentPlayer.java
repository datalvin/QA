import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCurrentPlayer {

	@Test
	void test() {
		Board board = new Board();
		assertEquals(board.currentPlayer, "X");
		board.changePlayer();
		assertEquals(board.currentPlayer, "O");
		
	}

}
