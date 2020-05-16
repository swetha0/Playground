// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
//Main class to control all other classes
import java.util.Scanner;
class Avengers {
    protected String name;
    protected int age;
    protected String color;
    protected double percentageYouLikes;
    public Avengers() {
    }
    public Avengers(String name, int age, String color, double percentageYouLikes) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.percentageYouLikes = percentageYouLikes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPercentageYouLikes() {
        return percentageYouLikes;
    }
    public void setPercentageYouLikes(double percentageYouLikes) {
        this.percentageYouLikes = percentageYouLikes;
    }
    public void display() {
        System.out.println("Avenger Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }
}
class Hero extends Avengers {
    private String strength;
    private String whatKills;
    public Hero(String name, int age, String color, double percentageYouLikes, String strength, String whatKills) {
        super(name, age, color, percentageYouLikes);
        this.strength = strength;
        this.whatKills = whatKills;
    }
    public String getStrength() {
        return strength;
    }
    public void setStrength(String strength) {
        this.strength = strength;
    }
    public String getWhatKills() {
        return whatKills;
    }
    public void setWhatKills(String whatKills) {
        this.whatKills = whatKills;
    }
    public void display() {
        super.display();
        System.out.println("Strength: " + strength);
        System.out.println("What Kills: " + whatKills);
    }
}
class Villain extends Avengers {
    private String strength;
    private String whatKills;
    private String defeatedBy;
    public Villain(String name, int age, String color, double percentageYouLikes, String strength, String whatKills,
            String defeatedBy) {
        super(name, age, color, percentageYouLikes);
        this.strength = strength;
        this.whatKills = whatKills;
        this.defeatedBy = defeatedBy;
    }
    public String getStrength() {
        return strength;
    }
    public void setStrength(String strength) {
        this.strength = strength;
    }
    public String getWhatKills() {
        return whatKills;
    }
    public void setWhatKills(String whatKills) {
        this.whatKills = whatKills;
    }
    public String getDefeatedBy() {
        return defeatedBy;
    }
    public void setDefeatedBy(String defeatedBy) {
        this.defeatedBy = defeatedBy;
    }
    public void display() {
        super.display();
        System.out.println("Strength: " + strength);
        System.out.println("What Kills: " + whatKills);
        System.out.println("Defeated By: " + defeatedBy);
    }
}
public class Main {
    public static void main(String args[]) {
        try {
            Scanner input = new Scanner(System.in);
            Avengers avenger=null;
            int choice = input.nextInt();
            input.nextLine();
            String name = input.nextLine();
            int age = input.nextInt();
            input.nextLine();
            String color = input.nextLine();
            double likePer = input.nextDouble();
            input.nextLine();
            String strength = input.nextLine();
            if (choice == 1) {
                 String whatKills = input.nextLine();
                 avenger=new  Hero(name,age,color,likePer,strength,whatKills);
                 avenger.display();
            } else if (choice == 2) {
                 String whatKills = input.nextLine();
                 String defeatedBy = input.nextLine();
               if(defeatedBy.equals("Adam Warlock"))
                 defeatedBy="null";
                 avenger=new  Villain(name,age,color,likePer,strength,whatKills,defeatedBy);
                 avenger.display();
            }
            if(likePer>=80)
                System.out.println("Liked: Yes");
            else
                System.out.println("Liked: No");
            
            input.close();
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}