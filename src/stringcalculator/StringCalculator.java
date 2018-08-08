package stringcalculator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringCalculator {

	public int calculate(String string) throws Exception {
		int sum = 0;
		if(! string.isEmpty()) {
			List<Integer> numbers = stringTokenizer(string);
			if(numbers.size() <= 3) {
				for(Integer number: numbers) {
					sum += number.intValue();
				}
			} else {
				sum += Integer.parseInt(string);
			}
		}
		return sum;
	}

	private List<Integer> stringTokenizer(String number) throws Exception{
		List<Integer> numbers = new ArrayList<Integer>();
		String[] strArray = number.split(",");
		for(int i = 0; i < strArray.length; ++i) {
			if(strArray[i].contains("\n")) {
				String[] strArray2 = strArray[i].split("\n");
				for (int x = 0; x < strArray2.length; ++x) {
					try {
						numbers.add(Integer.decode(strArray2[x]));
					}catch(Exception ex){}
				}
			}else {
				try {
					numbers.add(Integer.decode(strArray[i]));
				}catch(Exception ex){}

			}
		}
		return removeOver1000(numbers);
	}
	
	private List<Integer> removeOver1000(List<Integer> numbers) throws Exception{
		for(Iterator<Integer> iter = numbers.listIterator(); iter.hasNext();) {
			Integer number = iter.next();
			if(number > 1000) {
				iter.remove();
			}else if(number < 1) {
				throw new RuntimeException("Negative Numbers not Allowed");
			}
		}
		return numbers;
	}

}
