package InterviewCoding;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=sc.nextInt();
		int org_number=number;
		StringBuffer sb = new StringBuffer(String.valueOf(number));
		StringBuffer rev=sb.reverse();
		System.out.println("Rev value of "+rev);
		/*if(org_number==rev)
		{
			System.out.println(org_number+"Palindrome number");
		}
		else {
			System.out.println(org_number+"number is not palindrom number");
		}*/
		
	}

}
