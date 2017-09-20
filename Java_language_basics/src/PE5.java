import java.util.InputMismatchException;
import java.util.Scanner;

public class PE5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int usrInput;

		Scanner sc = new Scanner(System.in);

		usrInput = 0;

		int count = usrInput;

		System.out.println("Please input an integer and enter -1 to exit");
		while (usrInput != -1) {
			try {
				usrInput = sc.nextInt();
			} catch (InputMismatchException exception) {
				System.out.printf("This is not an integer", sc.next());
			}
			count += usrInput;

		}
		count -= usrInput;
		System.out.println(+count);
	}
}
