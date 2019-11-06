
public class MyClass {
	private int n;
	public MyClass() {
		n=100;
	}
	class MyChild{
		private int x;
		public MyChild() {
			x=200;
		}
		public void display() {
			System.out.println("Outer class variable : "+n);
			System.out.println("Child class variable : "+x);
		}
	}
	
	public void test() {
		System.out.println("Outer class variable : "+n);
	}

}
