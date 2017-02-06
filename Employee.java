//Employee class definition
//superclass
public class Employee{
//declare instance fields
 private String name;
 private String id;
 private double wage;

 //@param name the employee's name
 public void setName(String name){
 this.name = name;
 }
  //@param id the employee's id
  public void setId(String id){
  this.id = id;
  }
  //@param wage the employee's wage
   public void setWage(double wage){
   this.wage = wage;
   }
   public String getName(){
   return this.name;
   }
   public String getId(){
   return this.id;
   }
   public double getWage(){
   return this.wage;
   }
}
