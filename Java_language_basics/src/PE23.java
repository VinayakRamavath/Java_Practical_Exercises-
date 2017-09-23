import java.util.Scanner;

public class PE23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[100];
		a[0] = "India";
		a[1] = "United States";
		a[2] = "Germany";
		a[3] = "Egypt";
		a[4] = "czechoslovakia";

		for (int i = 0; i < a.length; i++) {
			a[i] = a[i].replaceAll("[aeiouAEIOU]", "");
			System.out.println(a[i]);

		}
		// for(int j=0;j<i;j++)
		// System.out.println(a[j]);
	}

}
