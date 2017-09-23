import java.util.Scanner;

public class PE17 {

	public static int factorial(int num) {
		
		int factorial=1,i=1;
		while(i<=num) {
			factorial*=i;
			i++;
		}
		if(factorial<(2147483647/2)) {
		System.out.println(+factorial);
		return 1;
		}
		else {
			System.out.println("out of bounds");
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int p=factorial(num);
		while(p==1) {
			num++;
			p=factorial(num);
		}
		
	}

}
