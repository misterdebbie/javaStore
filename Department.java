//Department class definition
//demonstrates aggregation
//Buyer object has a department
public class Department{
//declare instance fields
private String departmentName;
private double departmentBudget;
//private PurchaseOrder purchase;

//constructor
public Department(String departmentName, double departmentBudget){
this.departmentName = departmentName;
this.departmentBudget = departmentBudget;
//purchase = new PurchaseOrder(pOrder);
}
//copy constructor
public Department(Department object2){
  departmentName = object2.departmentName;
  departmentBudget = object2.departmentBudget;
}
public void set(String departmentName, double departmentBudget){
  this.departmentName = departmentName;
  this.departmentBudget = departmentBudget;
}
public String toString(){
  String str = "Department: " + departmentName + "\nDepartment Budget: $" + this.departmentBudget;
 return str;
}
/*public String getDepartmentName(){
 return this.departmentName;
}
public double getDepartmentBudget(){
return this.departmentBudget;
}
/*public PurchaseOrder getPurchaseOrder(){
  //return copy of department object
 return new PurchaseOrder(purchase);
}*/
}
