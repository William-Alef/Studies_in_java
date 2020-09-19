import java.util.Scanner;

public class exAula13a15 {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter 'A' value: ");
            double av = scan.nextDouble();

        if (av == 0){
            System.out.println("It's not a second degree equation.");
        }
        else{
            System.out.print("Enter 'B' value: ");
                double bv = scan.nextDouble();

            System.out.print("Enter 'C' value: ");
                double cv = scan.nextDouble();
        
            double del =((bv * bv) - (4 * av * cv));

            if (del == 0){
            System.out.println("Negative delta.");
            }
            else {
            double x1 = ((-bv) + Math.sqrt (del)) / (2 * av);
            double x2 = ((-bv) - Math.sqrt (del)) / (2 * av);

            System.out.println("");
            System.out.println("Delta: " + del);
            System.out.println("X1 value: " + x1);
            System.out.println("X2 value: " + x2);
            
            }
        }   
    }       
}
