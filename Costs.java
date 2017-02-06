//Costs class definition
public class Costs{
//declare instance fields
private double totalWages;
private double totalPurchases;

//constructor
public Costs(double totalWages, double totalPurchases){
this.totalWages = totalWages;
this.totalPurchases = totalPurchases;
}
public double getTotalWages(){
 return this.totalWages;
}
public double getTotalPurchases(){
return this.totalPurchases;
}
}
