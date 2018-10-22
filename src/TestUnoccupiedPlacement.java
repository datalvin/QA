import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestUnoccupiedPlacement {

	@Test
	void test() {
		Board board = new Board();
		board.createBoard();
		assertFalse(board.spaceInUse(3));
		board.makeMove(3);
		board.makeMove(3);
		assertEquals(board.getToken(3).value, "X");
	}

}
