import java.util.Scanner;

class TestPersonArray{
   public static void main(String[] args){
	   int count=0;
	   Person[] parr=new Person[50];
	   int choice;
	   
     do{
	   
       System.out.println("1. Add Person");
       System.out.println("2. Delete Person by name");
       System.out.println("3. Delete Person by id");
       System.out.println("4. Modify name");
       System.out.println("5. Display person");
       System.out.println("6.exit");
       System.out.println("Choice : ");
       
	   Scanner sc=new Scanner(System.in);
           choice=sc.nextInt();
	   switch(choice){
		   case 1:
		          PersonService.addPerson(parr,count);
			  count++;
		          break;
		   case 2:
		          System.out.println("Enetr name");
				  String nm=sc.next();
				  int pos=PersonService.deleteByName(parr,nm,count);
				  if(pos==-1){
					  System.out.println(nm+"not found");
				  }
				  else{
					  System.out.println(nm+"deleted successfully from "+pos);
					  count--;
				  }
		          break;
		   case 3:
		          System.out.println("Enter id");
				  int id=sc.nextInt();
				  pos=PersonService.deleteById(parr,id,count);
				  if(pos==-1){
					  System.out.println(id+" not found");
				  }
				  else{
					  System.out.println(id+"deleted successfully from "+pos);
					  count--;
				  }
		          break;
		   case 4:
		          	 System.out.println("enter id");
				  id=sc.nextInt();
				  System.out.println("enter name");
				  nm=sc.next();
				  pos=PersonService.modifyPerson(parr,id,nm,count);
				  if(pos==-1){
					  System.out.println(id+ " not found");
					  
				  }
				  else{
					 System.out.println("Modification done successfully for id "+id +"at position"+pos); 
				  }
		          break;	
          	   case 5:
		               PersonService.displayData(parr,count);
			        break;				  //System.gc(0);
		    case 6:
		          System.exit(0);
				  //System.gc(0);
		          break;		

  
	   }
	   }while(choice!=6);
   }

}
