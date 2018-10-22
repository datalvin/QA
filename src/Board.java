import java.util.ArrayList;

public class Board {
	public String player1 = "X";
	public String player2 = "O";
	public String currentPlayer;
	ArrayList<Token> board;
	public Board() {
		currentPlayer = player1;
	}
	
	public  ArrayList<Token> createBoard() {
		ArrayList<Token>board = new ArrayList<Token>(9);
		for (int i = 0; i < 9; i++) {
			board.add(i, new Token());
		}
		System.out.println(board.size());
		this.board = board;
		return board;
		
	}
	public String currentPlayer() {
		return currentPlayer;
	}
	public void changePlayer() {
		if (currentPlayer == player1) {
			currentPlayer = player2;
			
		}
		else {
			currentPlayer = player1;
		}
	}
	public void makeMove(int index) {
		if (!spaceInUse(index)) {
			board.get(index).setType(currentPlayer);
		}
		changePlayer();
	}
	public boolean spaceInUse(int index) {
		System.out.println(board.get(index).getType());
		return !board.get(index).getType().equals(" ");
	}
	public int size () {
		return board.size();
	}
	public Token getToken (int index) {
		return board.get(index);
	}
	
}
