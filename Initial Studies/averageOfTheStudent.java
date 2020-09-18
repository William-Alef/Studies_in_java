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

            int everage = ((fNote + sNote) / 2);
        System.out.println("-------------");
        System.out.println("Your everage: " + everage);



    }
}