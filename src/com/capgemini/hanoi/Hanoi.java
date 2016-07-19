package com.capgemini.hanoi;

/**
 * @author PWOJTKOW
 * Class with one method, which is counting numbers of moves needed to solve Hanoi Tower.
 */
public class Hanoi {

	private static final int BUFFOR_MOVE = 1;

	/**
	 * @param blocks is a number of block on Hanoi Tower.
	 * @return number of moves needed to set a Tower.
	 */
	public static long countHanoiMoves(final int blocks) {
		if (blocks == 0) {
			return 0;
		} else if (blocks == 1) {
			return 1;
		} else if (blocks > 1) {
			return countHanoiMoves(blocks - 1) + BUFFOR_MOVE + countHanoiMoves(blocks - 1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
