package Week6labs;

import java.util.Scanner;

public class Week6LabMain {
	public static void main(String[] args) {

	GameBoard gameBoard = new GameBoard();
	gameBoard.initialize();
	gameBoard.display();
	
	String winner = "";
	String player = "X";
	int allSquares = 1;
	int squareNum;
	Scanner in = new Scanner(System.in);
	
	System.out.println("-------------------------------"
					+ "\n-------Play Tic Tac Toe--------"
					+ "\n-------------------------------"
					+ "\n"
					+ "\nThis game requires two players,"
					+ "\ndecide X's or O's"
					+ "\n" + player
					+ " goes first!"
					+ "\n-------------------------------");
	
	while (winner.equals("") && allSquares<=9) {
		System.out.println(player + "'s turn! "
				+ "\nType a number and press enter.");
		String readInput = in.nextLine();
		squareNum= Integer.valueOf(readInput);
		if (squareNum >0 && squareNum<=9) {
			if (gameBoard.ifValidSetSquare(squareNum, readInput, player)){
				if (player.equals("X")) {
					player ="O";
				}else {
					player ="X";
				}
			} allSquares++;
			gameBoard.display();
			winner = gameBoard.checkWinStatus();
		}else {
			System.out.println("Please try again.");
		}
	}
	
	System.out.println("------------------------------");
	System.out.println("        Game Over!");
	if (winner.equals("draw")){
		System.out.println("      this game was a draw, no winner");
	}else {
		System.out.println("       Winner is: " + winner + "!");
	}
	System.out.println("------------------------------");

	in.close();	
	}//end of main

}//end
