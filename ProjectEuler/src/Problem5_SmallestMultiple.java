
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Smallest multiple
	Problem 5
	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * @author glen
 *
 */
public class Problem5_SmallestMultiple {
	
	public static void main(String[] args) {
		int smallest = smallestMultipleImproved(1, 20);
		System.out.println(smallest);
	}

	/**
	 * Improved soltuion - uses a boolean variable to test if the set 
	 * mets the conditions
	 */
	public static int smallestMultipleImproved(int start, int end) {
		if (end < start) {
			throw new IllegalArgumentException("End value cannot "
					+ "be less than start value");
		}
		
		int currNum = end;		
		while (true) {
			boolean all = true;			
			for (int i = start; i <= end; ++i) {
				if (currNum % i != 0) {
					all = false;
					break;
				} 
			}
			if (all) {
				return currNum;
			} 
			currNum++;
		}
	}
	
	/**
	 * Solution using a Set to store boolean values
	 */
	public static int smallestMultiple(int start, int end) {
		if (end < start) {
			throw new IllegalArgumentException("End value cannot "
					+ "be less than start value");
		}
		
		int currNum = end;		
		while (true) {
			Set<Boolean> results = new HashSet<>();
			
			for (int i = start; i <= end; ++i) {
				if (currNum % i == 0) {
					results.add(true);
				} 
				else {
					results.add(false);
					break;
				}
			}
			if (containsOnly(results, true)) { 
				return currNum;
			} 
			currNum++;
		}
	}
	
	/**
	 * Generic method to test if a Collection contains 
	 * a certain test value
	 */
	public static <E> boolean containsOnly(Collection<E> collection, E test) {
		for (E element : collection) {
			if (!element.equals(test)) {
				return false;
			}
		}		
		return true;
	}
}
