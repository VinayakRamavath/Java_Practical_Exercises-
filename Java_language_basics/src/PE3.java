import java.util.Scanner;

public class PE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter word");
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 97) && (str.charAt(i) <= 122) || (str.charAt(i) >= 65 && str.charAt(i) <= 90)) {
				if(str.charAt(i)=='a' || str.charAt(i)=='e'
						|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || 
						str.charAt(i)=='A' || str.charAt(i)=='E'
						|| str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
					System.out.print(str.charAt(i));
					System.out.println("-vowel");
				}
				else {
					System.out.print(str.charAt(i));
					System.out.println("-consonant");
				}
			} else {
				System.out.println("err");
			}
		}
	}

}
