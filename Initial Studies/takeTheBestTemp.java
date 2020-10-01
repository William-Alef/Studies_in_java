import java.util.Scanner;

public class takeTheBestTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double sum = 0;
        double nTemp;
        double temp;

        double bigger = Double.MIN_VALUE;
        double smaller = Double.MAX_VALUE;

        System.out.print("Enter the number of temperatures: ");
        nTemp = scan.nextDouble();

        System.out.println(" ");
        for (int i=0; i<nTemp; i++){
            System.out.print("Enter the temperature: ");
            temp = scan.nextDouble();

            sum += temp;
            if (temp > bigger){
                bigger = temp;
            }
            if (temp < smaller){
                smaller = temp;
            }
        }
        System.out.println("");
        System.out.println("The bigger: " + bigger);
        System.out.println("The smaller: " + smaller);
    }
}
