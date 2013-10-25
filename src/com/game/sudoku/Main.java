package com.game.sudoku;

public class Main {
	public static void main(String[] args) {
		SudokuSolver solver = new SudokuSolver(getQuiz());
		solver.solve();
		solver.printResult();
	}
	
	private static int[][] getQuiz() {
		int[][] quiz = new int[9][9];
		
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				quiz[row][col] = 0;
			}
		}
		
		// Quiz 1
		quiz[0][0] = 9;
		quiz[0][4] = 2;
		quiz[0][6] = 7;
		quiz[0][7] = 5;

		quiz[1][0] = 6;
		quiz[1][4] = 5;
		quiz[1][7] = 4;

		quiz[2][1] = 2;
		quiz[2][3] = 4;
		quiz[2][7] = 1;

		quiz[3][0] = 2;
		quiz[3][2] = 8;

		quiz[4][1] = 7;
		quiz[4][3] = 5;
		quiz[4][5] = 9;
		quiz[4][7] = 6;

		quiz[5][6] = 4;
		quiz[5][8] = 1;

		quiz[6][1] = 1;
		quiz[6][5] = 5;
		quiz[6][7] = 8;

		quiz[7][1] = 9;
		quiz[7][4] = 7;
		quiz[7][8] = 4;

		quiz[8][1] = 8;
		quiz[8][2] = 2;
		quiz[8][4] = 4;
		quiz[8][8] = 6;
		
		// Quiz 2
//		quiz[0][1] = 8;
//		quiz[0][3] = 4;
//		quiz[0][5] = 2;
//		quiz[0][7] = 6;
//		
//		quiz[1][1] = 3;
//		quiz[1][2] = 4;
//		quiz[1][6] = 9;
//		quiz[1][7] = 1;
//		
//		quiz[2][0] = 9;
//		quiz[2][1] = 6;
//		quiz[2][7] = 8;
//		quiz[2][8] = 4;
//		
//		quiz[3][3] = 2;
//		quiz[3][4] = 1;
//		quiz[3][5] = 6;
//		
//		quiz[5][3] = 3;
//		quiz[5][4] = 5;
//		quiz[5][5] = 7;
//		
//		quiz[6][0] = 8;
//		quiz[6][1] = 4;
//		quiz[6][7] = 7;
//		quiz[6][8] = 5;
//		
//		quiz[7][1] = 2;
//		quiz[7][2] = 6;
//		quiz[7][6] = 1;
//		quiz[7][7] = 3;
//		
//		quiz[8][1] = 9;
//		quiz[8][3] = 7;
//		quiz[8][5] = 1;
//		quiz[8][7] = 4;
		
		return quiz;
	}
}
