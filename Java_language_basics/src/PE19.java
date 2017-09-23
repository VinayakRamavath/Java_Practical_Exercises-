
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;

public class PE19 {
	
	public static void readfile(String a) {
		try {
			BufferedReader r = new BufferedReader( new FileReader( a ) );
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

	
	public static void main(String a[]){
		File file = new File("src");
		PE19 x=new PE19();
		File[] files = file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if(name.toLowerCase().endsWith(".txt")){
					return true;
				} else {
					return false;
				}
			}
		});
		for(File f:files){
			System.out.println(f.getName());
			x.readfile(f.getName());
		}
		
	}
}