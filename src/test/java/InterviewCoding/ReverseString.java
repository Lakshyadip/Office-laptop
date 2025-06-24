package InterviewCoding;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A name : ");
		String name =sc.next();
		int len=name.length();
		for(int i=len-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		
	}
}
