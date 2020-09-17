import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

        System.out.print("Enter with a latte: ");
            String str = scan.nextLine();

        if (str.equalsIgnoreCase("a")){
            System.out.println("Your typing a Vowel!");
        }
        else if (str.equalsIgnoreCase("E")){
         System.out.println("Your typing a Vowel!");
        }
        else if (str.equalsIgnoreCase("I")){
            System.out.println("Your typing a Vowel!");
        }
         else if (str.equalsIgnoreCase("O")){
            System.out.println("Your typing a Vowel!");
        }   
        else if (str.equalsIgnoreCase("U")){
            System.out.println("Your typing a Vowel!");
        }
        else{
            System.out.println("Your typing a Consonant!");
        }
            
   /*         
System.out.print("Enter with a latte: ");
    String str = scan.nextLine();
    
    if (str.length()> 1){
    System.out.println("It's not a valid latte! ");
    } 
    else {
    switch(str){
        case "a":
        case "e":
        case "i":
        case "o": 
        case "u":
        case "A":
        case "E":
        case "I":
        case "O": 
        case "U": System.out.println("Vowel!"); break;
        default: System.out.println("Consonant!");

       */        


    }
}