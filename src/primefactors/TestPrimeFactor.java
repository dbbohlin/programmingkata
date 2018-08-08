package primefactors;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPrimeFactor {
	PrimeFactor factor;
	
	@BeforeEach
	void setUp() throws Exception {
		factor = new PrimeFactor();
	}

	@Test
	void test_PrimeFactorExists() {
		PrimeFactor factor = new PrimeFactor();
	}
	
	@Test
	void test_PrimeFactorSend1Return0() {
		assertEquals(list(0), factor.factor(1));		
	}

	@Test
	void test_PrimeFactorSend2Return2() {
		assertEquals(list(2), factor.factor(2));		
	}
	
	@Test
	void test_PrimeFactorSend4Return22() {
		assertEquals(list(2,2), factor.factor(4));
	}
	
	@Test
	void test_PrimeFactorSend6Return23() {
		assertEquals(list(2,3), factor.factor(6));
	}
	
	@Test
	void test_PrimeFactorSend8Return222() {
		assertEquals(list(2,2,2), factor.factor(8));
	}
	
	@Test
	void test_PrimeFactorSend9Return33() {
		assertEquals(list(3,3), factor.factor(9));
	}
	
	private List<Integer> list(int... ints){
		List<Integer> list = new ArrayList<Integer>();
		for (int i : ints){
			list.add(i);
		}
		return list;
	}
}
