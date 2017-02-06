import java.util.Scanner;
//Store application
//main method
//tracks employee wages
//tracks buyer purchases
//tracks store sales and losses
public class Store {
 public static void main(String[] args){
//declare fields
//total employees
String eName, eId;
double eWage, totalHours;
int totalEmployees;
//create Scanner object
Scanner keyboard = new Scanner (System.in);
System.out.print("Enter total employees ");
totalEmployees = keyboard.nextInt();
//create employee objects array
Employee[] employees = new Employee [totalEmployees];
for (int index = 0; index < employees.length; index++){
  System.out.println("Employee " + (index+1)+ ": ");
  System.out.print("Enter name: ");
  eName = keyboard.nextLine();
  keyboard.nextLine();
  System.out.print("Enter id: ");
  eId = keyboard.nextLine();
  System.out.print("Enter wage: ");
  eWage = keyboard.nextDouble();
  System.out.print("Enter hours worked: ");
  totalHours = keyboard.nextDouble();
  //instantiate employee
  employees[index]= new Employee();
  employees[index].setName(eName);
  employees[index].setId(eId);
  employees[index].setWage(eWage);
  employees[index].setHours(totalHours);
}//close for loop
for (int index = 0; index < employees.length; index++){
  System.out.println("Employee " + (index+1));
  System.out.println("Employee name: " + employees[index].getName());
  System.out.println("Employee id: " + employees[index].getId());
  System.out.println("Employee wage: " + employees[index].getWage());
  System.out.println("Employee total wages: " + employees[index].getTotalWages());

}//close for loop

}
}//close Store app
