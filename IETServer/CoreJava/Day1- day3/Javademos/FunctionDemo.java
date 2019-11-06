class FunctionDemo{
    void myfunction(int a){
	    a++;
		System.out.println("Inside Function"+a);
	}
    public static void main(String[] args){
	 int a=12;
	 FunctionDemo f=new FunctionDemo();
     System.out.println("Before function call"+a); 	
     f.myfunction(a);
 	 System.out.println("After function call"+a); 
	}
}
