// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
//Main class to control all other classes
import java.util.Scanner;
class XeroxABook {
    protected String bookName;
    protected int numberOfPages;
    protected boolean hasSpiral;
    protected int ratePerPage = 0;
    XeroxABook(String bookName, int numberOfPages, boolean hasSpiral) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.hasSpiral = hasSpiral;
    }
    public int calculatePrice() {
            return (numberOfPages * getRatePerPage());
    }
    public int getRatePerPage() {
        return ratePerPage;
    }
}
class NormalXerox extends XeroxABook {
    protected int ratePerPage = 2;
    public NormalXerox(String bookName, int numberOfPages, boolean hasSpiral) {
        super(bookName, numberOfPages, hasSpiral);
    }
    public int calculatePrice() {
        if (super.hasSpiral)
            return (numberOfPages * getRatePerPage()) + 15;
        else
            return (numberOfPages * getRatePerPage());
    }
    
    public int getRatePerPage() {
        return ratePerPage;
    }
}
class ColorXerox extends NormalXerox {
    protected int ratePerPage = 5;
    public ColorXerox(String bookName, int numberOfPages, boolean hasSpiral) {
        super(bookName, numberOfPages, hasSpiral);
        super.ratePerPage = this.ratePerPage;
    }
}
public class Main {
    public static void main(String[] args) {
    try{
      boolean spiralStatus=false;
        XeroxABook bookCopy=null;
        
        Scanner input = new Scanner(System.in);
        
        int choice = input.nextInt();
        input.nextLine();
        String bookName = input.nextLine();
        int NumberOfPages = input.nextInt();
        input.nextLine();
        String SpiralorNot = input.nextLine();
        
        if (SpiralorNot.equalsIgnoreCase("yes"))
            spiralStatus = true;
        if (choice == 1) 
            bookCopy = new NormalXerox(bookName, NumberOfPages,spiralStatus);
        else if(choice==2)
             bookCopy = new ColorXerox(bookName,NumberOfPages,spiralStatus);
        else
            if(choice>=3)
                {System.out.println("Invalid Input");System.exit(0);}
                System.out.println("Xerox total price is: "+bookCopy.calculatePrice());       
        input.close();
    }
      catch(Exception e){System.out.println("Invalid Input");}
    }
}