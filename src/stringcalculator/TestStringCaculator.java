package stringcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStringCaculator {
	private StringCalculator strCalc;
	
	@BeforeEach
	void setUp() throws Exception {
		strCalc = new StringCalculator();
	}

	@Test
	void test() {
		StringCalculator strCalc = new StringCalculator();
	}

	@Test
	void test_EmptyStringReturns0() {
		try {
			assertEquals(0, strCalc.calculate(""));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void test_SingleNumberReturnsValue() {
		try {
			assertEquals(1, strCalc.calculate("1"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void test_2NumberCommaDelimitedReturnsSum() {
		try {
			assertEquals(2, strCalc.calculate("1,1"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void test_2NumberNewLineDelimitedReturnsSum() {
		try {
			assertEquals(2, strCalc.calculate("1\n1"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void test_3NumbersDelimitedReturnsSum() {
		try {
			assertEquals(3, strCalc.calculate("1,1\n1"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void test_NumbersOver1000Ignored() {
		try {
			assertEquals(2, strCalc.calculate("1,1001,1"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void test_NegativeNumberThrowsException() {
		assertThrows(RuntimeException.class, () -> {strCalc.calculate("1,2,-1");});
	}
}
