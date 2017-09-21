import java.util.Arrays;
import java.util.Scanner;

public class PE7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int number=a,n=0,temp=0,stor=a,rem,count=0;
		int[] arr=new int[100];
		while (number > 0) {
			arr[n]=number%10;
		    number = number / 10;
		    n++;
		    
		}
		while(stor!=0) {
			   rem=stor%10;
			   stor=stor/10;
			   if(rem%2==0)
				   count+=rem;
			   }
	    for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                     if(arr[j-1] > arr[j]){  
                            //swap elements  
                            temp = arr[j-1];  
                            arr[j-1] = arr[j];  
                            arr[j] = temp;  
                    }  
                     
            }  
    }  

		
		for(int j=0;j<n;j++)
System.out.println(arr[j]);
		
		if(count>25)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
