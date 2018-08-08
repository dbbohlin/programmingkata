package fizzbuzz;

public class FizzBuzz {

	public String of(int n) {
		StringBuilder builder = new StringBuilder();
		builder.append(divisableby3(n));
		builder.append(divisableBy5(n));
		builder.append(notdivisable(n));
		return builder.toString();
	}

	private String notdivisable(int n) {
		if(n % 5 != 0 && n % 3 != 0) {
			return "" + n;
		}
		return "";
	}

	private String divisableBy5(int n) {
		if(n % 5 == 0) {
			return "Buzz";
		}
		return "";
	}

	private String divisableby3(int n) {
		if(n % 3 == 0) {
			return "Fizz";
		}
		return "";
	}

}
