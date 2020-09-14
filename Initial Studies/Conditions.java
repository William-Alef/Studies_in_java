import java.util.Scanner;
    
class Conditions {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

            System.out.println("What's de price: ");

            Double price = Scan.nextDouble();

            if (price <= 20){
                System.out.println("Cool, veri nice price!");
            }    
            else if (price > 20 && price < 25){
                System.out.println("Good!");
            }
            else if (price > 25 && price < 27){
                System.out.println("Not bad!");
            }
            else {
                System.out.println("SO BAD!");

        }   
    }   
}
