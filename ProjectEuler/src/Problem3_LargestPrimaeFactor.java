import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Largest prime factor
	Problem 3
	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?
 * @author glen
 *
 */
public class Problem3_LargestPrimaeFactor {

	public static void main(String[] args) {
		long num = 6936363546356346L;
		List<Integer> factors = largestPrimeFactorImproved(num);
		int largest = Collections.max(factors);
		System.out.println(largest);
	}
	
	/*
	 * Solution is O(n) in the worst case
	 */
	public static List<Integer> largestPrimeFactor(long n) {
		int d = 2;
		List<Integer> factors = new ArrayList<>();
		
		while (n > 1) {
			while (n % d == 0) {
				factors.add(d);
				n /= d;
			}
			d++;
		}
		
		return factors;
	}
	
	/*
	 * Solution is O(n) in the worst case
	 */
	public static List<Integer> largestPrimeFactorImproved(long n) {
		int d = 2;
		List<Integer> factors = new ArrayList<>();
		
		while (n > 1) {
			while (n % d == 0) {
				factors.add(d);
				n /= d;
			}
			//special case for two being only even prime number
			if (d == 2) {
				d++;
			} 
			else {
				d+=2;
			}
			
			//Checks to see if d is more the sqrt(n)
			if (d*d > n) {
				if (n > 1) {
					factors.add((int) n);
					break;
				}
			}
		}
		
		return factors;
	}

}
