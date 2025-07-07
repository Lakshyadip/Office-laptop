package InterviewCoding;

public class Swapping2Number {
	
	public static void main(String[] args) {
		
		int a= 10;
		int b= 20;
		
		System.out.println("Before swapping values are "+a+" "+b);
		
		//Logic 1 (third variable)
		/*int t =a;
		a=b;
		t=b;*/
		
		//Logic 2 (+ & - Operator)
		/*a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20 */
		
		//Logic 3 (* & / operator)
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After swapping values are "+a+" "+b);
	}

}
