package JavaFundamentalson03022020;

public class PrintStringArrayAndCompare {

	public static void main(String[] args) {
		String[] data = new String[] 

		        { 

		                "Sony TV", "Samsung TV", "sony Mobile", "Onida TV" 

		        }; 
		for (String d : data) {
			if(d.toLowerCase().contains("sony"))
			System.out.println(d);
		}

	}

}
