import java.util.Scanner;

public class SidesTheTriangle {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first side: ");
            double fSide = scan.nextDouble();

        System.out.print("Enter the second side: ");
            double sSide = scan.nextDouble();

        System.out.print("Enter the third side: ");
            double tSide = scan.nextDouble();
            System.out.println("");

        if ((fSide + sSide) > tSide &&
            ((fSide + tSide) > sSide &&
            ((sSide + tSide) > fSide))){   
            System.out.println("Can be a triangle."); 
        }
        if((fSide == sSide) &&
            ((sSide == tSide))){
            System.out.println("Equilateral triangle.");
        }
        else if((fSide == sSide)||
        ((sSide == tSide)) ||
        (tSide == fSide)){
            System.out.println("Isosceles triangle.");
        } 
        else if ((fSide != sSide)||
        ((sSide != tSide)) ||
        (tSide != fSide)){
            System.out.println("Scalene triangle.");

        }
        else {
            System.out.println("It's not valid to create a triangle");
        }
    }
}