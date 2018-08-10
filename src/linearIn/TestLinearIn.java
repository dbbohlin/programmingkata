package linearIn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLinearIn {

	private LinearIn linear;

	@BeforeEach
	void setUp() throws Exception {
		linear = new LinearIn();
	}

	@Test
	void test_LinearInNullOrEmptyArrayReturnFalse() {
		assertEquals(false, linear.isSubset(null, null));
		assertEquals(false, linear.isSubset(new int[0], new int[0]));
	}

	@Test
	void test_LinearInSimpleArraysThatEqualReturnTrue() {
		assertEquals(true, linear.isSubset(new int[] {1}, new int[] {1}));
	}
	
	@Test
	void test_LinearInSimpleArraysThatDontEqualReturnFalse() {
		assertEquals(false, linear.isSubset(new int[] {1}, new int[] {2}));
	}
	
	@Test
	void test_LinearInMoreComplexArraysThatDontEqualReturnFalse() {
		assertEquals(false, linear.isSubset(new int[] {1, 2}, new int[] {1, 3}));
	}
	
	@Test
	void test_LinearInComplexArraysThatAreContainedReturnTrue() {
		assertEquals(true, linear.isSubset(new int[] {1,2,4,6}, new int[] {2,4}));
	}
	
	@Test
	void test_LinearInComplexArraysThatAreNotContainedReturnFalse() {
		assertEquals(false, linear.isSubset(new int[] {1,2,4,6}, new int[] {2,3,4}));
	}

}
