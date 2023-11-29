package Week6labs;

import java.util.Arrays;

public class GameBoard {

	String[] board = new String[9];
	
	public void initialize() {
		for (int i=1;i<10;i++) {
			this.board[i-1] = String.valueOf(i);
		}
	}// initialize
	
public void display() {
	System.out.println("     +---+---+---+");
	System.out.println("     | " + this.board[0] + " | " + this.board[1] + " | " + this.board[2] + " |");
	System.out.println("     +---+---+---+");
	System.out.println("     | " + this.board[3] + " | " + this.board[4] + " | " + this.board[5] + " |");
	System.out.println("     +---+---+---+");
	System.out.println("     | " + this.board[6] + " | " + this.board[7] + " | " + this.board[8] + " |");	
	System.out.println("     +---+---+---+");

	
	}
public boolean ifValidSetSquare(int squareNum, String Input, String player) {
	if (this.board[squareNum-1].equals(String.valueOf(Input))) {
		this.board[squareNum-1]=player;
		return true;
	}else {
	return false;
	}
}// end ifValidSetSquare

public String checkWinStatus() {
	for (int pos=0;pos<8;pos++) {
		String winCombo = "";
		switch(pos){
		case 0:
			winCombo = this.board[0] + this.board[1] + this.board[2];
			break;
		case 1:
			winCombo = this.board[3] + this.board[4] + this.board[5];
			break;
		case 2:
			winCombo = this.board[6] + this.board[7] + this.board[8];
			break;
		case 3:
			winCombo = this.board[0] + this.board[3] + this.board[6];
			break;
		case 4:
			winCombo = this.board[1] + this.board[4] + this.board[7];
			break;
		case 5:
			winCombo = this.board[2] + this.board[5] + this.board[8];
			break;
		case 6:
			winCombo = this.board[0] + this.board[4] + this.board[8];
			break;
		case 7:
			winCombo = this.board[2] + this.board[4] + this.board[6];
			break;
		}
		if (winCombo.equals("XXX")) {
				return "X";
		}else if (winCombo.equals("OOO")){
				return "O";	
	}
	}
	for (int pos=1; pos<=9;pos++) {
		if (Arrays.asList(this.board).contains(String.valueOf(pos))){
			break;
		}else if (pos==9) {
	return "draw";
		}
}
	return "";
}// end checkWinStatus

}// end

