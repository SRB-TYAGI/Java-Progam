package functions;

public class PrimeTwoToN {

	public static boolean isPrime(int n) {
		int d = 2;
		while (d < n) {
			if (n % d == 0) {
				return false;
			}
			d++;
		}
		return true;
	}
	
	public static void printPrimes(int n) {
		for (int i = 2; i <= n; i++) {
			// need to check if i is prime or not
			boolean isIPrime = isPrime(i);
			if (isIPrime) {
				System.out.println(i);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		printPrimes(100);
		System.out.println("back in main");
	}

}
