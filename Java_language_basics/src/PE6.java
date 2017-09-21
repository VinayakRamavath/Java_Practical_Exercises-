import java.util.Scanner;

public class PE6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char");
				char a= sc.next().charAt(0);
				int b=Character.getNumericValue(a);
				if(a>='a' && a<='z') {
					System.out.println("small Letter");
				}
				else if(a>='A' && a<='Z') {
					System.out.println("Capital letter");
				}
				else if(b<=9 && b>=0) {
					System.out.println("digit");
				}
				else {
					System.out.println("special character");
				}
		}
	

}
