package JavaFundamentalson03022020;

public class PowerOfNumber {
	
	static int power(int a, int b) {
		int pow=1;
		for (int i = 0; i < b; i++) {
			pow=pow*a;
		}
		return pow;
	}

	public static void main(String[] args) {
		System.out.println(power(5, 3));
	}
}
