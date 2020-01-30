package JavaFundamentals;

import java.util.Scanner;

public class FactorialRecursion {

	
	public static int recursion(int num) {
		if(num>=1) 
			return num*recursion(num-1);
		else
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int number=scanner.nextInt();
		recursion(number);
		System.out.println(recursion(number));
	}
	

}
