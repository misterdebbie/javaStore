//Buyer class definition
//extends Employee class
public class Buyer extends Employee{
//declare instance fields
private Department department;
private PurchaseOrder purchase;

//constructor
public Buyer(Department dept, PurchaseOrder pOrder){
  //create a new Department object
  //pass param dept to copy constructor
   department = new Department(dept);

  //create a new PurchaseOrder object
  //pass param pOrder to copy constructor
   purchase = new PurchaseOrder(pOrder);
}
 public Department getDepartment(){
   //return copy of department object
  return new Department(department);
 }
 public PurchaseOrder getPurchaseOrder(){
  //return copy of purchase object
  return new PurchaseOrder(purchase);
 }
 public String toString(){
   String str = "\nDepartment Info:\n" + department + "\nPurchase Order Info:\n" +
   purchase;
   return str;
 }

 }
