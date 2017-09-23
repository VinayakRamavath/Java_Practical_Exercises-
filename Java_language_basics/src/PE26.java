class Exception1 extends Exception {
	public Exception1(String msg) { 
		super(msg); 
		System.out.println("Exception1(String msg)");
	}
}

public class PE26 {

	
	public static void main(String[] args) {
		try {
			System.out.println("Throwing MyException from try");
			throw new Exception1("From try");
		} catch(Exception1 e) {
			System.err.println("Caught Exception1");
			e.printStackTrace();
		} finally {
			System.out.println("Made it to finally");
		}
		
	}
}
