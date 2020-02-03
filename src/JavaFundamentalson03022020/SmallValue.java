package JavaFundamentalson03022020;

public class SmallValue {
	
	static int smallValue() {
		int[] marks=new int[] {81,94,67,58,63};
		int small=marks[0];
		for (int i : marks) {
			if(small>i)
				small=i;
		}
		return small;
	}

	public static void main(String[] args) {
		System.out.println(smallValue());
	}

}
