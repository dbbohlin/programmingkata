package newbowling;

public class Bowling {
	private int[] rolls = new int[21];
	private int frameIndex = 0;
	
	public void rollBall(int pins) {
		rolls[frameIndex++]= pins;
	}

	public int score() {
		int score = 0;
		int frameIndex = 0;
		for(int frame = 0; frame < 10; frame++) {
			if (10 == rolls[frameIndex]) {
				score += 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2];
				frameIndex++;
			}else if(10 == rolls[frameIndex] + rolls[frameIndex + 1]) {
				score += 10 + rolls[frameIndex + 2];
				frameIndex += 2;
			}else {
				score += rolls[frameIndex] + rolls[frameIndex + 1];
				frameIndex += 2;
			}
		}
		return score;
	}

}
