
public class PE13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member m=new Member("Harry Potter",30,500.3 ); 
		System.out.println("member name"+m.name);
		System.out.println("member age"+m.age);
		System.out.println("member slaary"+m.salary);
	}

}

class Member {
	public String name;

	public int age;

	public double salary;

	public Member(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}
