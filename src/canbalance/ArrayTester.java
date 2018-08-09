/**
 * 
 */
package canbalance;

import java.util.Arrays;

/**
 * Given a non-empty array, return true if there is a place to split the array so that the sum
 * of the numbers on one side is equal to the sum of the numbers on the other side.
 *
 * canBalance([1, 1, 1, 2, 1]) → true
 * canBalance([2, 1, 1, 2, 1]) → false
 * canBalance([10, 10]) → true
 * 
 * @author dbohlin
 *
 */
public class ArrayTester {

	public boolean canBalance(int[] nums) {
		if (isArrayNullOrEmpty(nums)) {
			return false;
		}		
		return checkArray(nums);
	}

	private boolean checkArray(int[] nums) {
		int len = nums.length;
		for(int i = 0; i < nums.length; ++i) {
			int offset = nums.length - i;
			int[] firstSet = Arrays.copyOfRange(nums, 0, offset);
			int[] secondSet = Arrays.copyOfRange(nums, offset, nums.length);
			if(isArraysEqual(firstSet, secondSet)) {
				return true;
			}
		}
		return false;
	}

	private boolean isArrayNullOrEmpty(int[] nums) {
		return null == nums || nums.length < 2;
	}

	private boolean isArraysEqual(int[] firstnums, int[] secondnums) {
		return (arrayValue(firstnums) == arrayValue(secondnums));
	}
	
	private int arrayValue(int[] nums) {
		int value = 0;
		for(int i = 0; i < nums.length; ++i) {
			value += nums[i];
		}
		return value;
	}
}
