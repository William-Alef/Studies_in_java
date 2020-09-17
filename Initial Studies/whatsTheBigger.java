import java.util.Scanner;

public class whatsTheBigger {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
           int num1 = scan.nextInt();

        System.out.print("Enter a number: ");
           int num2 = scan.nextInt();

        System.out.print("Enter a number: ");
           int num3 = scan.nextInt();    


        if (num1 >= num2 && num1 >= num3){
            System.out.println("The firt is the bigger!");
        }
        else if (num2 >= num2 && num2 >= num3){
            System.out.println("The second is the bigger!");
        }    
        else if (num3 >= num1 && num3 >= num2){
            System.out.println("The third is the bigger!");
        }



    }
}