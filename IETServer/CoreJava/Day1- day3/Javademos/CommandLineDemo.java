class CommandLineDemo{
    public static void main(String[] args){
	  System.out.println("Hello World!");
	  System.out.println("Length : "+args.length);
	  for(int i=0;i<args.length;i++){
	     System.out.println("Hello " + args[i]);
	  }
	  String myvar="12";
	  int i=Integer.parseInt(myvar);
	}
}
