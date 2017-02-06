//PurchaseOrder class definition
//demonstrates aggregation
//Buyer object has a purchase order
public class PurchaseOrder{
//declare instance fields
private double orderTotal;
//private String[] orderDetail;
//constructor
public PurchaseOrder(double orderTotal){
 this.orderTotal = orderTotal;
}
public PurchaseOrder(PurchaseOrder object2){
  orderTotal = object2.orderTotal;
}
public void set(double orderTotal){
  this.orderTotal = orderTotal;
}
public String toString(){
  String str = "Purchase order total: $" + this.orderTotal;
  return str;
}
}
