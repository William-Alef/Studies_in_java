import java.util.Scanner;

public class adjustedWages{
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
    
        System.out.println("\tAdjusted wages\t");
        System.out.println(" ");
        System.out.print("Enter the salary: ");
        double salary = scan.nextDouble();  
        System.out.println("");

        if (salary <= 280){
            double s1 = ((salary / 100) * 20);
            System.out.println("Your salary corrent: " + salary);
            System.out.println("You earn more: " + s1);
            System.out.print("Your new salary is: " + (s1 + salary));
        }
        else if (salary > 280 && salary < 700){
            double s2 = ((salary / 100) * 15);
            System.out.println("Your salary corrent: " + salary);
            System.out.println("You earn more: " + s2);
            System.out.print("Your new salary is: " + (s2 + salary));
        } 
        else if (salary > 700 && salary < 1500){
            double s3 = ((salary / 100) * 10);
            System.out.println("Your salary corrent: " + salary);
            System.out.println("You earn more: " + s3);
            System.out.print("Your new salary is: " + (s3 + salary));
        }
        else if(salary >= 1500){
            double s4 = ((salary / 100) * 5);
            System.out.println("Your salary corrent: " + salary);
            System.out.println("You earn more: " + s4);
            System.out.print("Your new salary is: " + (s4 + salary));
        }
    }
}