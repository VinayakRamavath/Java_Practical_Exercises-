import java.util.Scanner;

public class PE4 {
public static void main(String[] args) {
	System.out.println("Enter no");
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" "+i);
		}
	}
}
}
