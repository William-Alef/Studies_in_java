import java.security.Principal;
import java.util.Scanner;
    
class checkYourNotes {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
    
        System.out.println("\tType your notes\t");
        System.out.println(" ");
        System.out.print("First note: ");
            int nu1 = scan.nextInt();

        System.out.print("Second note: ");
            int nu2 = scan.nextInt();

        System.out.print("Third note: ");
            int nu3 = scan.nextInt();

        System.out.print("Fourth note: ");
            int nu4 = scan.nextInt();

        System.out.println("");
    
            int averange = (nu1 + nu2 + nu3 + nu3) /4;
        System.out.print("Total average: " + averange);


    }   
 }
