package JavaFundamentals;

import java.util.Scanner;

public class PrimeNumberBetweenRange {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scanner.nextInt();
		System.out.println("enter second number");
		int b=scanner.nextInt();
		while (a < b) {
            boolean flag = false;
            for(int i = 2; i <= a/2; ++i) {
                // condition for nonprime number
                if(a % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(a + " ");
            ++a;
        }
	}
}
