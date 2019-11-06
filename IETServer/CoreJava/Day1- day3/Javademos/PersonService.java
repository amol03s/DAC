import java.util.Scanner;

class PersonService{
   public static void addPerson(Person[] parr,int cnt){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enetr id");
	   int id=sc.nextInt();
	   System.out.println("Enetr Name");
	   String nm=sc.next();
	   
	   parr[cnt]=new Person(id,nm);
	   
   }
   
   public static void displayData(Person[] pr,int cnt){
	   
	   for(int i=0;i<cnt;i++){
		   System.out.println(pr[i]);
		   
	   }
   }
   
   public static int deleteByName(Person[] parr,String nm,int cnt){
	  for(int i=0;i<cnt;i++){
		  if(parr[i].getName().equals(nm)){
			  for(int j=i;j<cnt-1;j++){
				  parr[j]=parr[j+1];
			  }
			  return i;
		  }
	  } 
	  return -1; 
   }
   public static int deleteById(Person[] parr,int id,int cnt){
	   int pos=PersonService.serachPersonById(parr,id,cnt);
	   if(pos!=-1){ 
		  	  for(int j=pos;j<cnt-1;j++){
				  parr[j]=parr[j+1];
			  }
			  return pos;
		  }
	  
	  return -1; 
   }
   
   private static int serachPersonById(Person[] parr,int id,int cnt){
	   for(int i=0;i<cnt;i++){
		  if(parr[i].getId()==id){
			  return i;
		  }
       }
	   return -1;
   }
   
   public static int modifyPerson(Person[] parr,int id,String nm,int count){
	  int pos=PersonService.serachPersonById(parr,id,count);
	  if(pos!= -1){
			  parr[pos].setName(nm);
			  return pos;
		  }
	  
	  return -1; 
   } 
   
}
