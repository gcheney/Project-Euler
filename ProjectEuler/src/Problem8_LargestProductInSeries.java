

/**
 * Largest product in a series
Problem 8
The four adjacent digits in the 1000-digit 
number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. 
What is the value of this product?

 * @author glen
 *
 */
public class Problem8_LargestProductInSeries {

	public static void main(String[] args) {
		
		final int NUM_DIGITS = 13;
		final String SERIES_AS_STRING = "7316717653133062491922511967442657474235534919493496983520"
					+ "3127745063262395783180169848018694788518438586156078911294949545950173"
					+ "7958331952853208805511125406987471585238630507156932909632952274430435"
					+ "5766896648950445244523161731856403098711121722383113622298934233803081"
					+ "3533627661428280644448664523874930358907296290491560440772390713810515"
					+ "8593079608667017242712188399879790879227492190169972088809377665727333"
					+ "0010533678812202354218097512545405947522435258490771167055601360483958"
					+ "6446706324415722155397536978179778461740649551492908625693219784686224"
					+ "8283972241375657056057490261407972968652414535100474821663704844031998"
					+ "9000889524345065854122758866688116427171479924442928230863465674813919"
					+ "1231628245861786645835912456652947654568284891288314260769004224219022"
					+ "6710556263211111093705442175069416589604080719840385096245544436298123"
					+ "0987879927244284909188845801561660979191338754992005240636899125607176"
					+ "0605886116467109405077541002256983155200055935729725716362695618826704"
					+ "28252483600823257530420752963450";
		
		int [] series = stringToIntArray(SERIES_AS_STRING);
		long largest = getLargestProdInSeries(series, NUM_DIGITS);
		System.out.println(largest);
	}
	
	public static int[] stringToIntArray(String raw) {
		int[] num = new int[raw.length()];
		
	    for (int i = 0; i < raw.length(); i++){
	        num[i] = raw.charAt(i) - '0'; //COnvert from ASCII value
	    }

	    return num;
	}
	
	public static long getLargestProdInSeries(int [] series, int numDigits) {
		long largestProd = 0;
		
		for (int i = 0; i < series.length - numDigits; i++) {
			long currProd = 1;
			
			for (int j = i; j < i + numDigits; j++) {
				currProd = currProd * series[j];
			}
			if (currProd > largestProd) {
				largestProd = currProd;
			}			
		}
		
		return largestProd;
	}

}
