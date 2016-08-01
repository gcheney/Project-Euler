
public class Problem7_10001stPrimeNumber {

	public static void main(String[] args) {
		final int PRIME_TO_FIND = 10001;
		int primeNum = getNthPrimeNumber(PRIME_TO_FIND);
		System.out.println(primeNum);
	}
	
	public static int getNthPrimeNumber(int n) {
		int currNum = 3, count = 1, result = 0;

		while (count < n) {
			if (isPrime(currNum)) {
				count++;
				result = currNum;
			}
			currNum++;
		}
		
		return result;
	}
	
	public static boolean isPrime(int n) {
		double num = n;
		for (int i = 2; i <= Math.sqrt(num); ++i) {
			if (num % i == 0) {
				return false;
			}
		}		
		return true;
	}
}
