package interviewPractice;

public class PrimeNumberDate8 {
	public static boolean isPrime (int number) {
		
		if (number == 2) {
			return true;
		}
		
		if (number < 2) {
			return false;
		}
		
		for (int i=2;i<number/2;i++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(9));
	}

}
