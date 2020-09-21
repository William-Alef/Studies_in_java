import java.util.Scanner;


public class exAula13a15 {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Please, answer with 'Yes' Or 'No'");
    System.out.println("");
    System.out.print("You call for victim: ");
        String q1 = scan.next();
       
    System.out.print("You were in place: ");
        String q2 = scan.next();
    
    System.out.print("You live close to the victim: ");
        String q3 = scan.next();

    System.out.print("You owed to the victim: ");
        String q4 = scan.next();

    System.out.print("You worked with the victim: ");
        String q5 = scan.next();

        if (q1.equalsIgnoreCase("Yes") &&
           (q2.equalsIgnoreCase("Yes") &&
           (q3.equalsIgnoreCase("Yes") &&
           (q4.equalsIgnoreCase("Yes") &&
           (q5.equalsIgnoreCase("Yes")))))){
           System.out.println("You is the killer!");
        }
        else if (q1.equalsIgnoreCase("no") &&
            (q2.equalsIgnoreCase("no") &&
            (q3.equalsIgnoreCase("no") &&
            (q4.equalsIgnoreCase("no") &&
            (q5.equalsIgnoreCase("no")))))){
            System.out.println("You are innocent.");
        }
        else if (q1.equalsIgnoreCase("Yes") &&
            (q2.equalsIgnoreCase("no") ||
            (q3.equalsIgnoreCase("Yes") &&
            (q4.equalsIgnoreCase("no") ||
            (q5.equalsIgnoreCase("Yes")))))){
            System.out.println("You are suspect.");
        }
        else {
            System.out.println("Accomplice");
        }
    }       
}
