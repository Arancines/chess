package application;

import boardgame.Board;
import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		
		Board board = new Board (8,8);
		Position pos = new Position(3, 5);
		System.out.println(pos);
		
	}

}
