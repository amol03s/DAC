class FunctionDemo1{
	//myfunction
    void myfunction1(Integer a){
	    a++;
	   System.out.println("Inside Function"+a);
	}
	//main 
    public static void main(String[] args){
	 Integer a=12;
	 FunctionDemo1 f=new FunctionDemo1();
    	 System.out.println("Before function call"+a); 	
    	 f.myfunction1(a);
 	 System.out.println("After function call"+a); 
	}
}
