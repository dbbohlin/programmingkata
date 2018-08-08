/**
 * 
 */
package maxspan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Consider the leftmost and rightmost appearances of some value in an array. 
 * We'll say that the "span" is the number of elements between the two inclusive. 
 * A single value has a span of 1. 
 * Returns the largest span found in the given array.
 *
 *
 * maxSpan([1, 2, 1, 1, 3]) → 4 (max number of entries between 1 and 1 is 4)
 * maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6 (max number of entries between 4 and 4 is 6)
 * maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6 (max number of entries between 4 and 4 is 6, 
 * 										max number of entries between 1 and 1 is 4)
 * 
 * @author dbohlin
 *
 */
public class MaxSpan {

	public int findMaxSpan(int[] nums) {
		if(checkArrayLength(nums)) {
			return 0;
		}
		int maxSpan = 1;
		int count = 0;
		maxSpan = maxSpan(nums, maxSpan);
		return maxSpan;
	}

	private int maxSpan(int[] nums, int maxSpan) {
		int count;
		for(int i = 0; i < nums.length; ++i) {
			for(int j = i+1; j < nums.length; ++j) {
				if(nums[i] == nums[j]) {
					count = j - i + 1;
					maxSpan = Math.max(maxSpan, count);
				}
			}
		}
		return maxSpan;
	}

	private boolean checkArrayLength(int[] nums) {
		if(null == nums || 0 == nums.length) {
			return true;
		}
		return false;
	}

}
