import java.util.Scanner;

public class PE16 {

	
	public static void min(int[] a,int tot) {

		int flag=999999999;
		for(int i=0;i<tot;i++) {
			if(a[i]<flag)
				flag=a[i];
		}

		System.out.println(+flag);
	}
	public static void max(int[] a,int tot) {
		int flag=0;
		for(int i=0;i<tot;i++) {
			if(a[i]>flag)
				flag=a[i];
	}
System.out.println(+flag);
	}


public static void average(int[] a,int tot) {
	int sum=0;
	int l=tot;
	for(int i=0;i<l;i++)
		sum+=a[i];
	int average=sum/l;
	System.out.println(+average);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PE16 x=new PE16();
		int[] a=new int[100];
Scanner sc=new Scanner(System.in);
int tot=sc.nextInt();
for(int i=0;i<tot;i++)
	a[i]=sc.nextInt();

x.min(a,tot);
x.max(a,tot);
x.average(a,tot);
	}

}
