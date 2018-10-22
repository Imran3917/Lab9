
import java.util.Scanner;
public class CircleApp {
    static Scanner scan=new Scanner(System.in);
    static int count=0;
    public static void errorMenu() {
        if(count==0)
            System.out.print("Do you want to continue?(yes or no)=");
        else
            System.out.print("Entered wrong option try again");
          String choice=scan.next();
          if(choice.equalsIgnoreCase("no")) {
              System.out.println("Good bye");
          }
          else if(choice.equalsIgnoreCase("yes")) {
              menu();
          }
          else {
              count=1;
              errorMenu();
          }
    }
    public static  void menu() {
        double radious=0.0;
        do {
            System.out.print("Enter the radius:");
              radious=scan.nextDouble();
              
              if(radious>=0.1) {
                  Circle circle=new Circle(radious);
                  System.out.println("Area="+circle.getArea());
                  System.out.println("FormatedArea="+circle.getFormattedArea());
                  System.out.println("Circumference="+circle.getCircumference());
                  System.out.println("FormatedCircumference="+circle.getFormattedCircumference());
                  errorMenu();
                 
              }
              else {
                  System.out.print("radious should be positive ");
              }
               
        }while(radious<0.0);
    }
    public static void main(String args[]) {
        
        menu();
    }
}



