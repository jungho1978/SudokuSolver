package com.game.sudoku;

public class SudokuSolver {

	int[][] model;

	public SudokuSolver(int[][] quiz) {
		model = quiz;
	}

	public void solve() {
		solve(0, 0);
	}

	protected boolean solve(int row, int col) {
		if (row > 8) {
			return true;
		}

		if (model[row][col] != 0) {
			return _next(row, col);
		} else {
			for (int num = 1; num < 10; num++) {
				if (!isDuplicated(row, col, num)) {
					model[row][col] = num;

					if (_next(row, col)) {
						return true;
					}
					model[row][col] = 0;
				}
			}
			return false;
		}

	}

	/** do not call this */
	public boolean _next(int row, int col) {
		if (col < 8) {
			return solve(row, col + 1);
		} else {
			return solve(row + 1, 0);
		}
	}

	private boolean isDuplicated(int row, int col, int num) {
		return isDuplicatedInBox(row, col, num) || isDuplicatedInRow(row, num)
				|| isDuplicatedInCol(col, num);
	}

	private boolean isDuplicatedInCol(int col, int num) {
		for (int row = 0; row < 9; row++) {
			if (model[row][col] == num) {
				return true;
			}
		}
		return false;
	}

	private boolean isDuplicatedInRow(int row, int num) {
		for (int col = 0; col < 9; col++) {
			if (model[row][col] == num) {
				return true;
			}
		}
		return false;
	}

	private boolean isDuplicatedInBox(int row, int col, int num) {
		int r = (row / 3) * 3;
		int c = (col / 3) * 3;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (model[r + i][c + j] == num) {
					return true;
				}
			}
		}
		return false;
	}

	public void printResult() {
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				System.out.print(" " + model[row][col]);
			}
			System.out.println();
		}

	}

}
