import java.security.Principal;
import java.util.Scanner;
    
class exer {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the amount you earn per hour: ");
        Double amount = scan.nextDouble();

        System.out.print("Enter your hours worked: ");
        Double hoursWorked = scan.nextDouble();

        Double endOfMonth = (amount * hoursWorked);
        Double incomeTax = (endOfMonth / 100) * 11;
        Double inss = (endOfMonth / 100) * 8;
        Double syndicate = (endOfMonth / 100) * 5;
        Double total = incomeTax + inss + syndicate;
        Double realSalary = endOfMonth - total;
    
        System.out.println("");
        System.out.println("You should receive: " + endOfMonth);
        System.out.println("But for the fees, you get: " + realSalary);
        
    }
}