import java.util.Scanner;

public class whatsTheBestPrice {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter the fist price: ");
            int num1 = scan.nextInt();
 
        System.out.print("Enter the second price: ");
            int num2 = scan.nextInt();
 
        System.out.print("Enter the third price: ");
            int num3 = scan.nextInt();    
 
        if (num1 <= num2 && num1 <= num3){
             System.out.println("The fist is the best price!");
        }
        else if (num2 <= num1 && num2 <= num3){
             System.out.println("The second is the best price!");
        }    
        else if (num3 <= num1 && num3 <= num2){
             System.out.println("The third is the best price!");
        }
    }
}