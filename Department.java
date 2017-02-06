//Department class definition
//demonstrates aggregation
//Buyer object has a department
public class Department{
//declare instance fields
private String departmentName;
private double departmentBudget;
//private PurchaseOrder purchase;

//constructor
public Department(String departmentName, String departmentBudget){
this.departmentName = departmentName;
this.departmentBudget = departmentBudget;
//purchase = new PurchaseOrder(pOrder);
}
public String getDepartmentName(){
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
