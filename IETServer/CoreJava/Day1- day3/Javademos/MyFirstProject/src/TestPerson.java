
public class TestPerson {
	static {
		System.out.println("In static block");
	}

	public static void main(String[] args) {
       Person p=new Person("Kishori");		
       Person p1=new Person("Rajan");
       Person p2=new Person("Revati");
       System.out.println(p);
       System.out.println(p1);
       System.out.println(p2);
	}

}
