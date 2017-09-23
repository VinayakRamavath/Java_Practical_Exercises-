import java.util.Scanner;

public class PE11 {

	public PE11(){
		
	}
	
	public static void palindrome(String str){
		int l=str.length(),flag=1;
		for(int i=0;i<l;i++)
		{
			if(str.charAt(i)!=str.charAt(l-i-1))
				flag=0;
		}
		if(flag==0) 
			System.out.println("not a plaindrome");
		else
			System.out.println("palindrome");
	}
	
	public static char[] reverse(String str) { 
		int l=str.length();
		char[] chararr=new char[10000];
		for(int i=0;i<l;i++)
		{	chararr[i]=str.charAt(l-i-1);
		}
		return chararr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PE11 ex=new PE11();
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ex.palindrome(str);
		char[] x=ex.reverse(str);
		for(int i=0;i<str.length();i++)
			System.out.println(x[i]);
	}

}
