/**
 * 
 */
package staircase;

/**
 * Consider a staircase of size 4:
	   #
	  ##
	 ###
	####
	Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
	Write a program that prints a staircase of size .
	Function Description
	Complete the staircase function in the editor below. It should print a staircase as described above.
	staircase has the following parameter(s):
	n: an integer
	Input Format
	A single integer, , denoting the size of the staircase.
	Constraints
	 .
	Output Format
	Print a staircase of size  using # symbols and spaces.
	Note: The last line must have  spaces in it.
	Sample Input
	6 
	Sample Output
	     #
	    ##
	   ###
	  ####
	 #####
	######
	Explanation
	The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of 6.
 * @author dbohlin
 *
 */
public class StairCase {

	public String build(int n) {
		if(n < 1) {
			return "";
		}
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < n ; ++i){
            for(int j = 0; j < n; ++j){
                if(j > ((n - i) - 2)){
                    builder.append("#");
                }else{
                    builder.append(" ");
                }
            }
            builder.append(System.lineSeparator());
        }

		return builder.toString();
	}

}
