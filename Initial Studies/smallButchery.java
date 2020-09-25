import java.util.Scanner;

public class smallButchery {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        boolean yes = true;
        do {
            System.out.println("We have: \n(1)Rump \n(2)Pork Chop \n(3)Filet Steak");
            System.out.println("");
            System.out.print("Whitch one: ");
                int numbBeef = scan.nextInt();

            System.out.print("How many: ");
                double kg = scan.nextDouble();

                double rump = 0;
                double pork = 0;
                double filet = 0;

            if (numbBeef == 1){
                if (kg <= 5){
                    rump = 4.90;
                }else{
                    rump = 5.80;
                }
            }   
            else if (numbBeef == 2){
                if (kg <= 5){
                    pork = 5.90;
                }else{
                    pork = 6.80;
                }
            }  
            else if (numbBeef == 3){
                if (kg <= 5){
                    filet = 6.90;
                }else{
                    filet = 7.80;
                }
            }    
            else {
                System.out.println("You not type a valid number");
            }
            double total1 = (rump * kg); 
            double total2 = (pork * kg);
            double total3 = (filet * kg);
            
            System.out.print("(1)Cash or (2)Credit Card: ");   
                double payMethod = scan.nextDouble();
                System.out.println(" ");   

            if ((numbBeef == 1) && (payMethod == 2)){
                double discount = ((total1 / 100) * 5);
                System.out.println("You buy: " + "Rump.");
                System.out.println(kg + "x" + " Rump.");
                System.out.println("Total is: " + (total1 - discount));
            }
            else if ((numbBeef == 1) && (payMethod == 1)){
                System.out.println("You buy: " + "Rump.");
                System.out.println(kg + "x" + " Rump.");
                System.out.println("Total is: " + total1);
            }
            else if ((numbBeef == 2) && (payMethod == 2)){
                double discount = ((total2/100) * 5);
                System.out.println("You buy: " + "Pork.");
                System.out.println(kg + "x" + " Pork.");
                System.out.println("Total is: " + (total2 - discount));
            }
            else if ((numbBeef == 2) && (payMethod == 1)){
                System.out.println("You buy: " + "Pork.");
                System.out.println(kg + "x" + " Pork.");
                System.out.println("Total is: " + total2);
            }
            else if ((numbBeef == 3) && (payMethod == 2)){
                double discount = ((total3/100) * 5);
                System.out.println("You buy: " + "Filet.");
                System.out.println(kg + "x" + " Filet.");
                System.out.println("Total is: " + (total3 - discount));
            }
            else if ((numbBeef == 3) && (payMethod == 1)){
                System.out.println("You buy: " + "Filet.");
                System.out.println(kg + "x" + " Filet.");
                System.out.println("Total is: " + total3);
            }
            System.out.print("You whant buy more 1(Yes) or 2(No): ");
                int more = scan.nextInt();

            if (more == 2){
                System.out.println("\nHave a good day!");
                break;
            }
        }while (yes);
    }
}
