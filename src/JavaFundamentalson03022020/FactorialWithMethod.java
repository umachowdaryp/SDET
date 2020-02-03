package JavaFundamentalson03022020;

public class FactorialWithMethod {
	
	static int factorial(int num) {
		int fact=1;
		for (int i = 1; i <=num; i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}
