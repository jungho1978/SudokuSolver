package com.game.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuSolverTest {

	private int row;
	private int col;

	class SudokuSolverStub extends SudokuSolver {

		public SudokuSolverStub(int[][] quiz) {
			super(quiz);
		}

		@Override
		public boolean solve(int r, int c) {
			row = r;
			col = c;
			return false;
		}
	}

	@Test
	public void testNext() {
		SudokuSolverStub stub = new SudokuSolverStub(null);
		stub._next(8, 8);
		assertEquals(9, row);
		assertEquals(0, col);
	}

}
