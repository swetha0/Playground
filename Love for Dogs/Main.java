// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
//Main class to control all other classes
import java.util.*;
class Dog{
	String name;
  	double weight;
    int age;
  	String color, breed;
  Dog(){}
  	Dog(String name, double weight, int age, String color, String breed){
    	this.name = name;
      	this.age = age;
      	this.weight = weight;
      	this.color = color;
      	this.breed = breed;
    }
	void check()
    {
    	if(name.matches("^[a-zA-Z\\s]*") && age>0 && weight > 0.0){
          System.out.println("Name of the dog: " + name + "\nWeight of the dog: " + weight + "\nAge of the dog: " + age + "\nColor of the dog: " + color + "\nBreed of the dog: " + breed);
        }
		else
           System.out.println("Invalid Input");
    }
}
public class Main{
  public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String name = sc.next();
    	double weight = sc.nextDouble();
    	int age = sc.nextInt();
    	String color = sc.next();
    	String breed1 = sc.next();
   		Dog p1 = new Dog(name, weight, age, color, breed1);
    	p1.check();
  }
}