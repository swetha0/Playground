// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
//Main class to control all other classes
import java.util.*;
class Laptop{
	String brandName, processorName, os;
  	long processorRange, ram;
  Laptop(){}
  	Laptop(String brandName, String processorName, String os, long processorRange, long ram){
    	this.brandName = brandName;
      	this.processorName = processorName;
      	this.os = os;
      	this.processorRange = processorRange;
      	this.ram = ram;
    }
	void displayLaptopDetails()
    {
    	if(processorRange>0 && ram > 0){
       		 System.out.println("Laptop Details");
         	 System.out.println("Laptop Brand: " + brandName + "\nProcessor Name: " + processorName + "\nOS: " + os + "\nProcessor Range: " + processorRange + " bit" + "\nRam: " + ram + " GB");
        }
		else
           System.out.println("Invalid Input");
    }
}
public class Main{
  public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String brandName = sc.nextLine();
    	String processorName = sc.nextLine();
    	String os = sc.next();
    	long processorRange = sc.nextLong();
    	long ram = sc.nextLong();
   		Laptop p1 = new Laptop(brandName, processorName, os, processorRange, ram);
    	p1.displayLaptopDetails();
  }
}