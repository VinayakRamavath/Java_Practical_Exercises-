
public class PE18 {

public static long longfactorial(long num) {
		
		long longfactorial=1,i=1;
		long max_value=4611686018427387904L;
		while(i<=num) {
			longfactorial*=i;
			i++;
		}
		if(longfactorial<(max_value)&&longfactorial>0) {
		System.out.println(+longfactorial);
		return 1;
		}
		else {
			System.out.println("out of bounds");
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=1;
		long p=longfactorial(num);
		while(p==1) {
			num++;
			p=longfactorial(num);
		}
		
	}

}
