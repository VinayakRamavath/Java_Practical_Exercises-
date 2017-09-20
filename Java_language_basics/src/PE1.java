import java.util.Scanner;

public class PE1 {
	
	public boolean checkpalindrome(int number) {
		int orig=number,rev=0,rem;
		while(number!=0) {
			rem=number%10;
			rev=rev*10+rem;
			number/=10;
		}
		if(orig==rev)
			return true;
		else
			return false;
	}
	 public static void main(String args[]){ 
 Scanner sc=new Scanner(System.in);
 PE1 pe1=new PE1();
		 System.out.println("Enter the no");  
		   int no=sc.nextInt();  
		   boolean chec=pe1.checkpalindrome(no);
		   if(chec) {
			   System.out.println(" it is a palindrome");
			   
		   }
		   else {
			   System.out.println("it is not a palindrome");
		   }
	 }
		 
}
