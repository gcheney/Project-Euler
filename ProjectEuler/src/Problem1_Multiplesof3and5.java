/**
 * Problem 1
	If we list all the natural numbers below 10 
	that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
	The sum of these multiples is 23.

	Find the sum of all the multiples of 3 or 5 below 1000.
 * @author glen
 *
 */
public class Problem1_Multiplesof3and5 {

	public static void main(String[] args) {
		int numbers[] = new int[] {3, 5};		
		int total = sumOfAllMultiples(1000, numbers);
		System.out.println(total);
	}
	
	public static int sumOfAllMultiples(int n, int [] nums) {
		int sum = 0;
		for (int i = 0; i < n; ++i) {
			for (int j : nums) {
				if (i%j == 0) {
					sum += i;
					break;
				}
			}
		}
		
		return sum;
	}
	
	//Non reusable way
	public static void sumOfAllMultiples() {
		int sum = 0;
		for (int i = 0; i < 1000; ++i) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

}
