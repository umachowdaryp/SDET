package JavaFundamentalson03022020;

public class BiggestValue {
	
	static int bigValue() {
		int[] marks=new int[] {81,94,67,58,63};
		int big=marks[0];
		for (int i : marks) {
			if(big<i)
				big=i;
		}
		return big;
	}

	public static void main(String[] args) {
		System.out.println(bigValue());
	}

}
