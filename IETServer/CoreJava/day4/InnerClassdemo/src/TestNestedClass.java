
public class TestNestedClass {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		MyClass.MyChild ob1=ob.new MyChild();
		ob1.display();
		ob.test();

	}

}
