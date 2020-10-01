import java.util.Scanner;

public class averagePerClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int clas;
        int stude;
        int avera;

        System.out.print("Enter the class numbers: ");
            clas = scan.nextInt();

        boolean retur = false;
        for (int i=0; i<clas; i++){
            do{
                System.out.print("Enter the number of students: ");
                stude = scan.nextInt();

                if (stude > 40){
                    System.out.println("Must have at most 40!");
                    System.out.println("Try again.");
                    System.out.println("");
                    retur = true;
                }
            }while(retur);
            sum +=stude;
        }
        avera = sum/clas;
        System.out.println("Classes: " + clas);
        System.out.println("Average: " + avera + " students per class.");
    }
}
