package staircase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStairCase {

	private StairCase staircase;

	@BeforeEach
	void setUp() throws Exception {
		staircase = new StairCase();
	}

	@Test
	void test_StairCaseZeroReturnsEmptyString() {
		assertEquals("", staircase.build(0));
	}
	
	@Test
	void test_StairCaseOneReturnsPoundSign() {
		assertEquals("#\n", staircase.build(1));
	}
	
	@Test
	void test_StairCaseTwoReturnsSmallStairSizeTwo() {
		assertEquals(" #\n##\n", staircase.build(2));
	}

}
