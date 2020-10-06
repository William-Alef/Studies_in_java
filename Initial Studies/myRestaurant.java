/**
 * myRestaurant
 */
import java.util.Scanner;
public class myRestaurant {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean again = true;
        int code, amoun;
        double total = 0;
        String output = "";
    
        do { 
            DecimalFormat format = new DecimalFormat("###,###.##");
            System.out.println("Snacks          Code    Price");
            System.out.println("");
            System.out.println("Hot-Dog         100     US$ 1,20");
            System.out.println("Simple Bauru    101     US$ 1,30");
            System.out.println("Bauru with egg  102     US$ 1,50");
            System.out.println("litle burger    103     US$ 1,20");
            System.out.println("Mega burger     104     US$ 1,30");
            System.out.println("Coca-Cola       105     US$ 1,00");
            System.out.println("");
            System.out.print("Enter 0 for exit. \nEnter the code: ");
            code = scan.nextInt();
            System.out.print("Enter the amount: ");
            amoun = scan.nextInt();

            if (code == 0){
                again = false;
                output += "\n" + "Final total: = " + total;
            } else {
                if (code == 100){
                    double hotDog = (amoun * 1.20);
                    output += (amoun + "x " + "Hot-Dog" + " = " + format.format(hotDog) + "\n");
                    total += hotDog;
                }
                else if (code == 101){
                    double sBauru = (amoun * 1.30);
                    output += (amoun + "x " + "Simple Bauru" + " = " + format.format(sBauru) + "\n");
                    System.out.println(output);
                    total += sBauru;
                }
                else if (code == 102){
                    double bwEgg= (amoun * 1.50);
                    output += (amoun + "x " + "Bauru with egg" + " = " + format.format(bwEgg) + "\n");
                    System.out.println(output);
                    total += bwEgg;
                }
                else if (code == 103){
                    double lHambur = (amoun * 1.20);
                    output += (amoun + "x " + "Litle amburger" + " = " + format.format(lHambur) + "\n");
                    System.out.println(output); 
                    total += lHambur;
                }
                else if (code == 104){
                    double mBurger = (amoun * 1.30);
                    output += (amoun + "x " + "Mega Burger" + " = " + format.format(mBurger) + "\n");
                    System.out.println(output);
                    total += mBurger;
                }
                else if (code == 105){
                    double cocaC= (amoun * 1.00);
                    output += (amoun + "x " + "Coca-Cola" + " = " + format.format(cocaC) + "\n");
                    System.out.println(output);
                    total += cocaC;
                }
            }
        }while(again);
        System.out.print(output);
    }
}
