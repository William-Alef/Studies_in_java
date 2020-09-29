import java.util.Scanner;

/**
 * pairAndOdds
 */

public class pairAndOdds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int odd = 0;
        int pair = 0;

        for(int i=0; i<10; i++){
            System.out.print("Enter a number: ");
            num = scan.nextInt();

            if(num % 2==0){
                pair++;
            }else {
                odd++;
            }
        }
        System.out.println("");
        System.out.println("Pair's: " + pair);
        System.out.println("Odd's: " + odd);
    }
    
} 