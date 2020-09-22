import java.util.Scanner;


public class fuelScript {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("#============================================#"); 
        System.out.println("# Enter 'G' for Gasoline and 'E' for Ethanol #");
        System.out.println("#============================================#"); 
        System.out.println("");
        System.out.print("Which one: ");
        System.out.print("");

            String combustive = scan.next();

        System.out.print("Hou many liters: ");
            double liters = scan.nextDouble();
            System.out.println("");

            double gasoline = (liters * 2.50);
            double Ethanol = (liters * 1.90);

        if (combustive.equalsIgnoreCase("g")){
            if (gasoline <= 20){
                double totalG20L = ((gasoline/100) * 4);
                System.out.println("Combustive: Gasoline.");
                System.out.print("Total price: " + (gasoline - totalG20L + " For " + liters + "L"));
            }
            else if (gasoline > 20){
                double totalG21L = ((gasoline/100) * 6);
                System.out.println("Combustive: Gasoline.");
                System.out.print("Total price: " + (gasoline - totalG21L + " For " + liters + "L"));
            }
        }
        else if (combustive.equalsIgnoreCase("e")){
            if (Ethanol <= 20){
                double totalE20L = ((Ethanol/100) * 4);
                System.out.println("Combustive: Ethanol.");
                System.out.print("Total price: " + (Ethanol - totalE20L + " For " + liters + "L"));
            }
            else if (Ethanol > 20){
                double totalE21L = ((Ethanol/100) * 6);
                System.out.println("Combustive: Etalonl.");
                System.out.print("Total price: " + (Ethanol - totalE21L + " For " + liters + "L"));
            }
        }   
        else {
            System.out.println("You did not type a valid word, or valid number");        
        }
    }       
}