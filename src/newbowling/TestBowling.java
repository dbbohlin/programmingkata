package newbowling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBowling {
	private Bowling game;
	
	@BeforeEach
	void setUp() throws Exception {
		game = new Bowling();
	}

	@Test
	void test_bowlingRollBall() {
		game.rollBall(0);
	}
	
	@Test
	void test_bowlingRollBall0_Score0() {
		game.rollBall(0);
		assertEquals(0, game.score());
	}
	
	@Test
	void test_bowlingRollBall1_Score1() {
		game.rollBall(1);
		assertEquals(1, game.score());
	}
	
	@Test
	void test_bowlingRollBallSeveralTimes() {
		for (int i = 0; i < 20; ++i) {
			game.rollBall(1);
		}
		assertEquals(20, game.score());
	}
	
	@Test
	void test_bowlingThrow1Spare() {
		game.rollBall(5);
		game.rollBall(5); //spare
		game.rollBall(3);
		assertEquals(16, game.score());
	}
	
	@Test
	void test_bowlingThrow1Strike() {
		game.rollBall(10);
		game.rollBall(3);
		game.rollBall(4);
		assertEquals(24, game.score());
	}
	
	@Test
	void test_bowlingPerfectGame() {
		for(int i = 0; i<12; ++i) {
			game.rollBall(10);
		}
		assertEquals(300, game.score());
	}
}
