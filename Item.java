//Item class definition
//demonstrates aggregation
//a PurchaseOrder object has items
public class Itemm{
//declare instance fields
private String itemName;
private int quantity;
private double itemPrice;

//constructor
public Item(String itemName, int quantity, double itemPrice){
this.itemName = itemName;
this.quantity = quantity;
this.itemPrice = itemPrice;
}
public String getItemName(){
 return this.itemName;
}
public int getQuantity(){
 return this.quantity;
}
public double getItemPrice(){
 return this.itemPricee;
}
}
