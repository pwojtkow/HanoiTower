package com.capgemini.hanoi.test;

import org.junit.Test;

import com.capgemini.hanoi.Hanoi;

public class HanoiTest {

	@Test
	public void shouldHanoiMethodReturnZero() {
		// given
		int blocks = 0;
		// when
		long moves = Hanoi.countHanoiMoves(blocks);
		// then
		org.junit.Assert.assertEquals(0, moves);
	}
	
	@Test 
	public void shouldHanoiMethodReturnOne(){
		//given
		int blocks = 1;
		//when
		long moves = Hanoi.countHanoiMoves(blocks);
		//then
		org.junit.Assert.assertEquals(1, moves);
	}

	@Test
	public void shouldHanoiMethodReturnThree(){
		//given
		int blocks = 2;
		//when
		long moves = Hanoi.countHanoiMoves(blocks);
		//then
		org.junit.Assert.assertEquals(3, moves);
	}
	
	@Test
	public void shouldHanoiMethodReturn31(){
		//given
		int blocks = 5;
		//when
		long moves = Hanoi.countHanoiMoves(blocks);
		//then
		org.junit.Assert.assertEquals(31, moves);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void shouldHanoiMethodReturnMinusOne() throws IllegalArgumentException{
		//given
		int blocks = -3;
		//when
		long moves = Hanoi.countHanoiMoves(blocks);
	}
}
