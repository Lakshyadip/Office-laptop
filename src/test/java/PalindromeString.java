import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		String org_str=str;
		String rev="";
		int len=str.length();
		for(int i =len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		if(org_str==rev) {
			System.out.println(org_str+"Palindrome String");
		}
		else {
			System.out.println(org_str+"not Palindrome String");
		}
		
		
	}

}
