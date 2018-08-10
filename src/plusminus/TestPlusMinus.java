package plusminus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPlusMinus {

	private PlusMinus plusminus;

	@BeforeEach
	void setUp() throws Exception {
		plusminus = new PlusMinus();
	}

	@Test
	void test_PlusMinusNullOrEmptyArrayReturnsZeros() {
		int[] arr = new int[0];
		assertEquals("0.000000\n0.000000\n0.000000", plusminus.plusMinusZero(arr));
	}

}
