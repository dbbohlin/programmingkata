package bowling;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBowling {

	private BowlingGame game = new BowlingGame();
	
	@BeforeEach
	void setUp() throws Exception {
		game = new BowlingGame();
	}

	@Test
	public void bowling_canThrow() {
		game.throwball(0);
	}
	
	@Test
	void bowling_throw0Returns0() {
		game.throwball(0);
		assertEquals(0, game.score());
	}
	
	@Test
	public void bowling_canScoreGutterGame() {
		manyThrows(20, 0);
		assertEquals(0, game.score());
	}

	private void manyThrows(int throwCount, int pins) {
		for (int i = 0; i < throwCount ; i++) {
            game.throwball(pins);
        }
	}
	
	@Test
	public void bowling_canScore1pinPerThrow() {
		manyThrows(20, 1);
		assertEquals(20, game.score());
	}

	@Test
	public void bowling_testOneSpare() {
		throwSpare();//Spare
		game.throwball(3);
		manyThrows(17, 0);
		assertEquals(16, game.score());
	}

	private void throwSpare() {
		game.throwball(5);
		game.throwball(5);
	}
	
	@Test
	public void bowling_testOneStrike() {
		throwSpike(); // strike
		game.throwball(3);
		game.throwball(4);
		manyThrows(16, 0);
		assertEquals(24, game.score());
	}
	
	@Test
	public void bowling_testPerfectGame() {
		manyThrows(12, 10);
		assertEquals(300, game.score());
	}

	private void throwSpike() {
		game.throwball(10);
	}
}
