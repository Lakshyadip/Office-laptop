package InterviewCoding;

import java.util.Scanner;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //user input
		System.out.println("Enter a number:"); //enter number
		
		int num =sc.nextInt(); //convert store number in variable
		
		// Logic 1. using buffer class method
		
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse number is "+rev);*/
		
		// Logic 2. Using string builder method
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println("Reverse number is "+rev);
		
		
		
		
		
		
	}

}
