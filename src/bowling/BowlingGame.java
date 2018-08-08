package bowling;

public class BowlingGame {
	private int score = 0;
	private int[] rolls = new int[21];
	private int currentThrow = 0;
	
	static public final int MAX_THROWS = 20;
	static public final int MAX_PINS = 10;
	static public final int MAX_SCORE = 300;
	static public final int THROWS_PER_FRAME = 2;
	static public final int MAX_FRAMES = 10;
	
	public void throwball(int pins) {
		rolls[currentThrow++] = pins;
	}

	public int score() {
		int score = 0;
		int frameIndex = 0;
		for (int frame = 0; frame < MAX_FRAMES; ++frame) {
			if (isStrike(frameIndex)) { //Strike
				score += strikeBonus(frameIndex);
				frameIndex++;
			} else if (isSpare(frameIndex)) { //Spare
				score += spareBonus(frameIndex);
				frameIndex += THROWS_PER_FRAME;
			} else {
				score += frameScore(frameIndex);
				frameIndex += THROWS_PER_FRAME;
			}
			
		}
		return score;
	}

	private boolean isStrike(int frameIndex) {
		return rolls[frameIndex] >= MAX_PINS;
	}

	private int frameScore(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex + 1];
	}

	private int spareBonus(int frameIndex) {
		return MAX_PINS + rolls[frameIndex +2];
	}

	private int strikeBonus(int frameIndex) {
		return MAX_PINS + rolls[frameIndex + 1] + rolls[frameIndex + 2];
	}

	private boolean isSpare(int frameIndex) {
		return frameScore(frameIndex) >= MAX_PINS;
	}

}
