package JavaFundamentals;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scanner.nextInt();
		System.out.println("Enter second number");
		int b=scanner.nextInt();
		int power=1;
		for (int i = 1; i <= b; i++) {
			power=power*a;
		}
System.out.println(power);
	}

}
