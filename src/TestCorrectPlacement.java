import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCorrectPlacement {

	@Test
	void test() {
		Board board = new Board();
		board.createBoard();
		board.makeMove(3);
		assertEquals(board.getToken(3).getType(), "X");
		board.makeMove(4);
		assertEquals(board.getToken(4).getType(), "O");
	}

}
