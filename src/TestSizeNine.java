import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSizeNine {

	@Test
	void test() {
		Board board = new Board();
		board.createBoard();
		assertEquals(board.size(),9);
	}

}
