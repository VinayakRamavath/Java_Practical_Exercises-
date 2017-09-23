import java.util.Scanner;

public class PE12 {

	public PE12(){
		
	}
	public static void root(int num){
		double x=Math.pow(num,0.25);
		if(x%1==0)
			System.out.println("4th root exists");
		else
			System.out.println("4th root doesnt exist");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		PE12 x=new PE12();
		x.root(num);
	}

}
