
/**
 * The sum of the squares of the first ten natural numbers is,

	12 + 22 + ... + 102 = 385
	The square of the sum of the first ten natural numbers is,

	(1 + 2 + ... + 10)2 = 552 = 3025
	Hence the difference between the sum 
	of the squares of the first ten natural numbers 
	and the square of the sum is 3025 − 385 = 2640.

	Find the difference between the sum of the squares 
	of the first one hundred natural numbers and the square of the sum.
 * @author glendon cheney
 *
 */
public class Problem6_SumSquareDifference {

	public static void main(String[] args) {
		int sumOfSquares = sumOfSquaresFrom(1, 100);
		int squareOfSums = squareOfSumsFrom(1, 100);
		int difference = squareOfSums - sumOfSquares;
		 
		System.out.println(difference);
	}
	
	/**
	 * Adds the squares of all the numbers between 
	 * the @start to the @end
	 */
	public static int sumOfSquaresFrom(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; ++i) {
			int squared = i*i;
			sum += squared;
		}		
		return sum;
	}
	
	/**
	 * Retruns the square of the sum of numbers from 
	 * the @start to the @end 
	 */
	public static int squareOfSumsFrom(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; ++i) {
			sum += i;
		}
		return sum*sum;
	}

}
