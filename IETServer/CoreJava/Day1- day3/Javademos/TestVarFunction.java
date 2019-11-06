class TestVarFunction{
  /* public static int findAddition(int a,int b,int...arr,){
      int sum=0;
	  sum=a+b;
	  for(int i=0;i<arr.length;i++){
	     sum+=arr[i];
	  }
      return sum; 
   }*/
   public static void f1(int a){
	   System.out.println("in a");
	   
   }
   public static void f1(int...a){
	   System.out.println("in b");
	   
   }
   public static void main(String[] args){
     /* int sum=findAddition(12,13);
	  System.out.println("Addition : "+sum);
      sum=findAddition(12,40,34,56,47,24);
	  System.out.println("Addition : "+sum);*/
	  f1(10);
	  f1(10,20);
   }

}