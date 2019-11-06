class Person{
  private int id;
  private String name;
  
  public Person(){
     id=0;
     name=null;
  }
   public Person(int id,String nm){
    this.id=id;
    this.name=nm;
  }
  
  public void setId(int id){
	  this.id=id;
  }
  public void setName(String nm){
	  this.name=nm;
  }
  public int getId(){
	  return id;
  }
   public String getName(){
	  return name;
  }
  public String toString(){
	  return "Id : " +this.id+"\nName : "+this.name;
	  
  }
}
