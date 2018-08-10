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
}
