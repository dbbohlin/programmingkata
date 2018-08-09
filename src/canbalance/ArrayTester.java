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
		if (null == nums || nums.length < 2) {
			return false;
		}
		int[] firstnums = Arrays.copyOfRange(nums, 0, nums.length/2);
		int[] secondnums = Arrays.copyOfRange(nums, (nums.length/2), nums.length);
		if(firstnums[0] != secondnums[0]) {
			return false;
		}
		return true;
	}

}
