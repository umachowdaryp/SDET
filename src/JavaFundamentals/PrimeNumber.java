package JavaFundamentals;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scanner.nextInt();
		boolean flag = false;
		for (int i = 2; i <= n/2; i++) {
			if(n%i==0) {
				flag = true;
                break;
			}
		}
		if (!flag)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
	}

}
