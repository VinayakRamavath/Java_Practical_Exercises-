
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PE14 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		BufferedReader r = new BufferedReader( new FileReader( "testt.txt" ) );
		String s = "", line = null;
		while ((line = r.readLine()) != null) {
		    s += line;
		}
		System.out.print(s.toUpperCase());
		r.close();}
		catch(IOException e) {
			System.out.println("errrrrrrrrrrrrrrrrrr");
		}
	}

}
