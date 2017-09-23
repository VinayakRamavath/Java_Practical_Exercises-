import java.util.Scanner;

public class PE25 {

	public static void main(String[] args) throws NumberFormatException {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] w = a.split(",", 0);
		
		int[] num=new int[100];
		
num[0]=Integer.parseInt(w[0]);
		for (int i = 1; i < w.length; i++) {
num[i]=Integer.parseInt(w[i]);
System.out.println(+num[i]);

System.out.println(+num[i-1]-1);
if((num[i]!=(num[i-1]-1))&&(num[i]!=(num[i-1]+1)))
	{flag=1;
	 System.out.println("flag"+flag);
	}	}
		if(flag==1)
			System.out.println("non consecutive");
		else
			System.out.println("consecutive");


		}
}
