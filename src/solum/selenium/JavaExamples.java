package solum.selenium;

public class JavaExamples {
	boolean val;

	public static void main(String[] args) {
		int myNum = 7;
		float fNum = 10.587685f;
		double dNum = 92.559868746543;
		String sname = "Solum India Pvt Ltd";
		JavaExamples obj = new JavaExamples();
		boolean value = obj.val;
		int[] arr = { 1, 2, 3 };

		//System.out.print(myNum + " is the Interger value\n");
		//System.out.print(fNum + " is the float value\n");
		//System.out.print(dNum + " is the double value\n");
		System.out.print(sname + " is the string value\n");
		//System.out.print(value + " is the boolean value\n");
		//System.out.println(arr[2] + " is the array values\n");
		
		for(int i=0;  i<arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}
		
		String[] str= {"Solum", "India", "Korea"};
		for(String s: str)
		{
			System.out.println(s);
		}

	}

}