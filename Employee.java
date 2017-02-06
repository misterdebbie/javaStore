//Employee class definition
//superclass
public class Employee{
//declare instance fields
 private String name;
 private String id;
 private double wage;
 private double hours;


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
   //@param hours the employee's wage
    public void setHours(double hours){
    this.hours = hours;
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
   public double getTotalWages(){
   return this.wage * this.hours;
   }
}
