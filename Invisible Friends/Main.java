import java.util.*;
class Friend{
               String name, gender;
              int age;
 Friend(){}
              Friend(String name, String gender, int age){
              this.name = name;
              this.age = age;
              this.gender = gender;
   }
               void check()
   {
              if(name.matches("^[a-zA-Z]*") && age>0 && gender.matches("^M(ale)?$|^F(emale)?$")){
         System.out.println("Friends Details");
         System.out.println("Name: " + name + "\nGender: " + gender + "\nAge: " + age);
       }
                               else
          System.out.println("Invalid Input");                            
   } 
}
public class Main{
 public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
              String name = sc.nextLine();
              String gender = sc.next();
              int age = sc.nextInt();
                              Friend p1 = new Friend(name, gender, age);
              p1.check();
 }
}