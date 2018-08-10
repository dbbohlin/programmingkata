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
	}

}
