import java.util.*;
class ProGrad{
	String name, skill;
  	long id;
  ProGrad(){}
  	ProGrad(String name, long id, String skill){
    	this.name = name;
      	this.id = id;
      	this.skill = skill;
    }
	void check()
    {
    	if(name.matches("^[a-zA-Z\\s]*") && id>0){
          System.out.println("ProGrad Details");
          System.out.println("ProGrad Name: " + name + "\nId: " + id + "\nSkill: " + skill);
        }
		else
           System.out.println("Invalid Input");
    }
}
public class Main{
  public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String name = sc.nextLine();
    	long id = sc.nextLong();
    	sc.nextLine();
    	String skill = sc.nextLine();
   		ProGrad p1 = new ProGrad(name, id, skill);
    	p1.check();
  }
}