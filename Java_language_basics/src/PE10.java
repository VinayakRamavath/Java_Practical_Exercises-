import java.util.Scanner;

public class PE10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String input1 = sc.next();
		System.out.println("enter no");
		int input2 = sc.nextInt();
		int l=input1.length();
		if(input2<=l) {
		String substr=new String();
		substr=input1.substring(l-input2, l);
		System.out.print(input1);
		for(int i=0;i<input2;i++)
		System.out.print(substr);
	}
		else
		{
			System.out.println("no is greater than string length");
		}
	}

}
