import java.util.Scanner;

public class PE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		if(i%2!=0 && i<30 && i>20)
		System.out.println("Tom");
		else
			if(i%2==0 && i<30 && i>20)
			System.out.println("Jerry");
		else
			System.out.println("it doesn't match the specs");
	}

}
