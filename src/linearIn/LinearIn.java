/**
 * 
 */
package linearIn;

/**
 * Given two arrays of ints sorted in increasing order, outer and inner, 
 * return true if all of the numbers in inner appear in outer. 
 * The best solution makes only a single "linear" pass of both arrays, 
 * taking advantage of the fact that both arrays are already in sorted order.
 *
 *	linearIn([1, 2, 4, 6], [2, 4]) → true
 *	linearIn([1, 2, 4, 6], [2, 3, 4]) → false
 *	linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 *
 * @author dbohlin
 *
 */
public class LinearIn {

	public boolean isSubset(int[] outer, int[] inner) {
		if(isNullOrEmpty(outer, inner)) {
			return false;
		}
		return innerContainsOuter(outer, inner);
	}

	private boolean innerContainsOuter(int[] outer, int[] inner) {
		for(int i = 0; i < outer.length; ++i) {
			if(outer[i] > inner[0]) {
				return false;
			} else {
				boolean isMatch = true;
				for(int j = 0; j < inner.length && j < outer.length; ++j) {
					if(outer[i + j] != inner[j]) {
						isMatch=false;
						break;
					}
				}
				if(isMatch) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isNullOrEmpty(int[] outer, int[] inner) {
		return null == outer || null == inner || 0 == outer.length || 0 == inner.length;
	}

}
