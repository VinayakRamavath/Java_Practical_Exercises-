import java.util.Scanner;

public class PE8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int target=20;

		System.out.println("enter no or enter a no greater than 50 to exit");
		int num=0;
		
		while(num<50) {

			num=sc.nextInt();
			if(num<target) {
				System.out.println("no guessed is less than orig no");
			}
			if(num>target) {
				System.out.println("no guessed is more than orig no");
			}
			if(num==target) {
				System.out.println("you guessed it right");
			}
		}
	}
}
