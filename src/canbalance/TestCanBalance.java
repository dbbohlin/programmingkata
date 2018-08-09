package canbalance;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCanBalance {

	private ArrayTester tester;

	@BeforeEach
	void setUp() throws Exception {
		tester = new ArrayTester();
	}

	@Test
	void test_CanBalanceEmptyOrNullArrayReturnsFalse() {
		assertEquals(false, runCanBalance(null));
		assertEquals(false, runCanBalance(new int[0]));
	}
	
	@Test
	void test_CanBalanceSingleElementArrayReturnsFalse() {
		assertEquals(false, runCanBalance(new int[] {1}));
	}
	
	@Test
	void test_CanBalanceSimpleBalancedArrayReturnsTrue() {
		assertEquals(true, runCanBalance(new int[] {1,1}));
	}
	
	@Test
	void test_CanBalanceSimpleUnbalanceArrayReturnsFalse() {
		assertEquals(false, runCanBalance(new int[] {1,2}));
	}

	@Test
	void test_CanBalanceMoreComplexBalanceArrayReturnsTrue() {
		assertEquals(true, runCanBalance(new int[] {2,1,1,2}));
	}
	
	@Test
	void test_CanBalanceMoreComplexUnbalanceArrayReturnsFalse() {
		assertEquals(false, runCanBalance(new int[] {2,1,2,2}));
	}
	
	@Test
	void test_CanBalanceComplexOddArrayBalancedReturnsTrue() {
		assertEquals(true, runCanBalance(new int[] {2,1,1,2,2}));
	}
	
	private boolean runCanBalance(int[] nums) {
		return tester.canBalance(nums);
	}
}
