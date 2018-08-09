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
		int[] nums = null;
		assertEquals(false, tester.canBalance(nums));
		nums = new int[0];
		assertEquals(false, tester.canBalance(nums));
	}
	
	@Test
	void test_CanBalanceSingleElementArrayReturnsFalse() {
		int[] nums = {1};
		assertEquals(false, tester.canBalance(nums));
	}
	
	@Test
	void test_CanBalanceSimpleBalancedArrayReturnsTrue() {
		int[] nums = {1,1};
		assertEquals(true, tester.canBalance(nums));
	}
	
	@Test
	void test_CanBalanceSimpleUnbalanceArrayReturnsFalse() {
		int[] nums = {1,2};
		assertEquals(false, tester.canBalance(nums));
	}

}
