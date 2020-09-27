import java.util.Scanner;
public class gowthRate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        System.out.print("Type the first country population: ");
            int fP = scan.nextInt();
    
        System.out.print("Type the first growth rate: ");
            double fR = scan.nextDouble();

        System.out.print("Type the second country population: ");
            int sP = scan.nextInt();

        System.out.print("Type the second growth rate: ");
            double sR = scan.nextDouble();

        while (fP < sP) {
        
            fP += (fP / 100) * fR;
            sP += (sP / 100) * sR;
            count++;
        }
        System.out.println("First country population: " + fP);
        System.out.println("First country population: " + sP);
        System.out.println("Year's: " + count);
    }
}
