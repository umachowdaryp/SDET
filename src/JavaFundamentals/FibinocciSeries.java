package JavaFundamentals;

public class FibinocciSeries {

	public static void main(String[] args) {
		int n1=0,n2=1;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 2; i <10; i++) {
			int sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
	}

}
