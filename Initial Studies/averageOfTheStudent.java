import java.util.Scanner;

public class averageOfTheStudent {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.println("\tEnter your note student\t");
        System.out.println("");

        System.out.print("First note: ");
            int fNote = scan.nextInt();

        System.out.print("Second note: ");
            int sNote = scan.nextInt();

        System.out.print("Third note: ");
            int tNote = scan.nextInt();

        System.out.print("Four note: ");
            int ffNote = scan.nextInt();

        System.out.print("Fifth note: ");
            int fifNote = scan.nextInt();

        System.out.println("-------------");

            int everage = ((fNote + sNote + tNote + fNote + fifNote) / 2);

            if (everage < 5){
                System.out.println("Disapproved!");
                System.out.println("Your note: " + everage);
            }
            else if (everage >= 5){
                System.out.println("Not bad, approved!");
                System.out.println("Your note: " + everage);
            }
            else if (everage >= 10){
                System.out.println("Approved, you take the best note!");
                System.out.println("Your note: " + everage);
            }
                System.out.println("Your everage: " + everage);
    }
}