import java.security.Principal;
import java.util.Scanner;
    
class exer {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Type the side of the square: ");
        Double radius = scan.nextDouble();

        Double area = Math.pow(radius, radius);

        System.out.println("");
        System.out.println("The area of your square is: " + area);
        System.out.print("The doble is: " + (area * 2));

        
    }       
}