import java.security.Principal;
import java.util.Scanner;
    
class exer {
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Fahrenheith: ");
    Double fahrenheith = scan.nextDouble();

    Double forCel = (fahrenheith - 32) * 5 / 9;
    System.out.print("In degrees Celsius: " + forCel);

    }
}