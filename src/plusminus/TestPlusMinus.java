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

	@Test
	void test_PlusMinusArrayReturnsCorrectValue() {
		int[] arr = {-4, 3, -9, 0, 4, 1};
		assertEquals("0.500000\n0.333333\n0.166667", plusminus.plusMinusZero(arr));
	}

}
