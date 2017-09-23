import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PE20 {

	public static void frequency(String s) {
		String trimmed = s.trim().replaceAll(" +", " ");
		String[] a = trimmed.split(" ");
		ArrayList<Integer> p = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (p.contains(i)) {
				continue;
			}
			int d = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j])) {
					d += 1;
					p.add(j);
				}
			}
			System.out.println("Count of " + a[i] + " is:" + d);
		}
	}

	public static void main(String[] args) {
		PE20 x = new PE20();
		String st = new String("");
		try {
			BufferedReader r = new BufferedReader(new FileReader("testt.txt"));
			st = "";
			String line = null;
			while ((line = r.readLine()) != null) {
				st += line;
			}
			System.out.print(st);
			r.close();
		} catch (IOException e) {
			System.out.println("errrrrrrrrrrrrrrrrrr");
		}
		x.frequency(st);
	}

}