import java.util.Scanner;

public class classAge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the amount of people: ");
        int nP = scan.nextInt();
        
        double sum = 0;
        double ave;
        double age;

        for (int i=0; i<nP; i++){
            System.out.print("Enter teh ages: ");
            age = scan.nextInt();
            sum += age;
        }
        ave = sum/nP;
        System.out.println("");
        System.out.println("Average: " + ave);
        
        if (ave <= 26){
            System.out.println("Young class");
        } 
        else if((ave > 26) && (ave <= 60)){
            System.out.print("Adult class");
        }
        else {
            System.out.println("Old class");
        }
    }
}
