package interviewPractice;

public class FibonacciSeriesDate8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 0;
		int next = 1;
		int sum = 0;
		System.out.println(first);
		System.out.println(next);
		for (int i=0;i<5-2;i++) {
			sum = first + next;
			
			System.out.println(sum);
			first = next;
			next = sum;
		}

	}

}
