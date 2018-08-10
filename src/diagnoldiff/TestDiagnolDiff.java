package diagnoldiff;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDiagnolDiff {

	private DiagonolDiff diagdiff;

	@BeforeEach
	void setUp() throws Exception {
		diagdiff = new DiagonolDiff();
	}

	@Test
	void test_DiagonolDiffEmptyOrNullArrayThrowsException() {
		
	}

	@Test
	void test_DiagonolDiffOutputArrayReturn15() {
		int[][] arr = {{11,2,4},{4,5,6},{10,8,-12}};
		assertEquals(15, diagdiff.diagonalDifference(arr));
	}

	@Test
	void test_DiagonolDiffArraySize5Return() {
		int[][] arr = {{11,2,4,2,4},{4,5,6,-7,8},{10,8,-12,-12,8},{2,4,6,7,9},{1,4,6,-2,-12}};
		assertEquals(9, diagdiff.diagonalDifference(arr));
		
	}
}
