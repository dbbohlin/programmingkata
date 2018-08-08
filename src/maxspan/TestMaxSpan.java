package maxspan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMaxSpan {
	MaxSpan maxspan;
	
	@BeforeEach
	void setUp() throws Exception {
		maxspan = new MaxSpan();
	}

	@Test
	void test_maxspan() {
		maxspan = new MaxSpan();		
	}

	@Test
	void test_maxspanEmptyArray() {
		int result = maxSpanResult(new int[0]);
		assertEquals(0, result);
	}

	private int maxSpanResult(int[] nums) {
		int result = maxspan.findMaxSpan(nums);
		return result;
	}
	
	@Test
	void test_maxspanSingleValueArray() {
		int[] nums = {1}; 
		assertEquals(1, maxSpanResult(nums));
	}
	
	@Test
	void test_maxspanTwoElementArray() {
		int[] nums = {1,1};
		assertEquals(2, maxSpanResult(nums));
	}
	
	@Test
	void test_maxspanTwoElementArrayShoudReturnOne() {
		int[] nums = {1,2};
		assertEquals(1, maxSpanResult(nums));
	}
	
	@Test
	void test_maxspanComplexSpanShouldReturn6() {
		int[] nums = {1, 4, 2, 1, 4, 1, 4};
		assertEquals(6, maxSpanResult(nums));
	}
	
	@Test
	void test_maxspanMoreComplexSpanWithNegativeNumbersShouldReturn6() {
		int[] nums = {1, 4, 2, 1, 4, 1, 4, 3, -3, 5, 9, -6};
		assertEquals(6, maxSpanResult(nums));
	}
}
