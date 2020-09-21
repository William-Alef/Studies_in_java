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

        int cont = 0;

        if (q1.equalsIgnoreCase("Yes")){
            cont++;
        }
        if (q2.equalsIgnoreCase("Yes")){
            cont++;
        }
        if (q3.equalsIgnoreCase("Yes")){
            cont++;
        }
        if (q4.equalsIgnoreCase("Yes")){
            cont++;
        }
        if (q5.equalsIgnoreCase("Yes")){
            cont++;
        }
        if (cont == 2){
            System.out.println("You are suspect.");
        } 
        else if (cont == 3 || cont == 4){
            System.out.println("Accomplice");
        }
        else if (count == 5){
            System.out.println("You is the killer!");
        }
        else if (cont == 0){
            System.out.println("You are innocent.");
        }
    }       
}
