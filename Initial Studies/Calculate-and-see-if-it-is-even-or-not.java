import java.util.Scanner;


public class exAula13a15 {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number: ");
            Double n1 = scan.nextDouble();

        System.out.print("Enter a another number: ");   
            Double n2 = scan.nextDouble();

        System.out.println("Enter a operator: \n(a)+ For addition \n(b)- For subtraction \n(c)* For multiplication \n(d)** For calculate powers \n(e)/ For division.");
            String op = scan.next();

            double ad = (n1 + n2);
            double su = (n1 - n2);
            double mu  = (n1 * n2);
            double po  = Math.pow(n1, n2);
            double di  = (n1 / n2);

            double diva = (ad % 2);
            double divb = (su % 2);
            double divc = (mu % 2);
            double divd = (po % 2);
            double dive = (di % 2);

        if(op.equalsIgnoreCase("a")){
            System.out.println(ad);
            if (diva == 0){
                System.out.println("This number is even.");
            }
            else{
                System.out.println("This number is odd.");
            }
        }
        else if (op.equalsIgnoreCase("b")){
            System.out.println(su);
            if (divb == 0){
                System.out.println("This number is even.");
            }
            else{
                System.out.println("This number is odd.");
            }
        }
        else if(op.equalsIgnoreCase("c")){
            System.out.println(mu);
            if (divc == 0){
                System.out.println("This number is even.");
            }
            else{
                System.out.println("This number is odd.");
            }
        }
        else if(op.equalsIgnoreCase("d")){
            System.out.println(po);
            if (divd == 0){
                System.out.println("This number is even.");
            }
            else{
                System.out.println("This number is odd.");
            }
        }
        else if(op.equalsIgnoreCase("e")){
            System.out.println(di);
            if (dive == 0){
                System.out.println("This number is even.");
            }
            else{
                System.out.println("This number is odd.");
            }
        }
    }       
}