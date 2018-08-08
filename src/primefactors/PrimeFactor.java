package primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public List<Integer> factor(int factor) {
		List<Integer> primes = new ArrayList();
		int prime = 2;
		if (factor == 1) {
			primes.add(0);
			return primes;
		}
		while (factor > 1) {
			while (factor % prime == 0) {
				primes.add(prime);
				factor /= prime;
			}
			++prime;
		}
		if (factor > 1) {
			primes.add(factor);
		}
		return primes;
	}

}
