
/**
 *  Largest palindrome product
	Problem 4
	A palindromic number reads the same both ways. 
	The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two 3-digit numbers.
 * @author glen
 *
 */
public class Problem4_LargestPaindromeProduct {
	
	public static void main(String[] args) {
		int largestPalindrome = getLargestPalindromeProduct(100, 999);
		System.out.println(largestPalindrome);
	}
	
	public static int getLargestPalindromeProduct(int min, int max) {
		int largest = 0;
		
		for (int i = max; i >= min; --i) {
			for (int j = i; j >= min; --j) {
				int multiple = i*j;
				if (isPalindrome(multiple) && multiple > largest) {
					largest = multiple;
				}
			}
		}
		
		return largest;
	}
	
	public static boolean isPalindrome(int n) {
		String num = Integer.toString(n);
		return num.equals(new StringBuilder(num).reverse().toString());
	}

}
