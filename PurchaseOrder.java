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
public double getOrderTotal(){
 return this.orderTotal;
}
}
