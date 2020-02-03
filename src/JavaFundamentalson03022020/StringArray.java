package JavaFundamentalson03022020;

public class StringArray {

	public static void main(String[] args) {
		String[] subjects = new String[]
				{"Telugu","Hindi","English","Maths","Science","Social"};

		int[] marks = new int[]
				{80,78,75,28,32,80};
		for (int i = 0; i < marks.length; i++) {
			String result = (marks[i]>35) ? "Pass" : "Fail";
				System.out.println(subjects[i]+" : "+result);
		}
	}

}
