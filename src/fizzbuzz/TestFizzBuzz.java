package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFizzBuzz {
	private FizzBuzz fizz;
	
	@BeforeEach
	void setUp() throws Exception {
		fizz = new FizzBuzz();
	}

	@Test
	void test_FizzBuzzExists() {
		FizzBuzz fizz = new FizzBuzz();
	}
	
	@Test
	void test_FizzBuzzSend1Return1() {
		assertEquals("1", fizz.of(1));
	}
	
	@Test
	void test_FizzBuzzSend3ReturnFizz() {
		assertEquals("Fizz", fizz.of(3));
	}
	
	@Test
	void test_FizzBuzzSend5ReturnBuzz() {
		assertEquals("Buzz", fizz.of(5));
	}
	
	@Test
	void test_FizzBuzzSend15ReturnFizzBuzz() {
		assertEquals("FizzBuzz", fizz.of(15));
	}
	
	@Test
	void test_FizzBuzzSend16Return16() {
		assertEquals("16", fizz.of(16));
	}

}
