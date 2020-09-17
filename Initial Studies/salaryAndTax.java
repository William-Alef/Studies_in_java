import java.util.Scanner;

public class salaryAndTax{
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.println("\tSalary / Salary after taxes\t");
        System.out.println("");
        System.out.print("Enter the amount you earn per hour: ");
            double salary = scan.nextDouble();

        System.out.print("Enter your hours worked: ");
            Double hoursWorked = scan.nextDouble();

        System.out.println("----------");

            Double endOfMonth = (salary * hoursWorked);
            Double incomeTax = ((endOfMonth / 100) * 11);
            Double inss = ((endOfMonth / 100) * 8);
            Double syndicate = ((endOfMonth / 100) * 5);
            Double total = (incomeTax + inss + syndicate);
            Double realSalary = (endOfMonth - total);
            
        System.out.println("Your salary: " + endOfMonth);
        System.out.println("Your liquid salary: " + realSalary);
    }
}