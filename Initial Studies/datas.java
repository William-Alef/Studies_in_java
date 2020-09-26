import java.util.Scanner;

public class datas {
    public static void main(String[] args) {
        
        boolean nam = false;
            String name;
            int age;
            double salary;
            String sex;
            String mStatus;
            do {
                
                System.out.print("Name: ");
                    name = scan.next();
                if (name .length() >= 3){
                    nam = true;
                }else{
                    System.out.println("Invalid name");
                }
            }while (!nam);

            boolean age1 = false;
            do{
                System.out.print("Age: ");
                    age = scan.nextInt();

                if ((age > 0) && (age < 150)){
                    age1 = true;
                }else{
                    System.out.println("Invalid age.");
                }
            }while (!age1);   
            
            boolean sal = false;
            do{
                System.out.print("Salary: ");
                    salary = scan.nextDouble();

                if (salary > 0){
                    sal = true;
                }else{
                    System.out.println("Invalid salary.");
                }
            }while (!sal);  

            boolean sexx = false;
            do{
                System.out.println("Sex W(Woman) or M(Men)");
                System.out.println("");
                System.out.print("Sex: ");
                   sex = scan.next();

                if (sex.equalsIgnoreCase("w") || (sex.equalsIgnoreCase("m")) ){
                    sexx = true;
                }else{
                    System.out.println("Invalid sex.");
                }
                if  (sex.equalsIgnoreCase("w")){
                    sex = "Woman";
                }
                else{
                    sex = "Men";
                }
            }while (!sexx);  

            boolean mari = false;
            do{
                System.out.println("\nMarital Status\n ");
                System.out.println("");
                System.out.println("M = Married");
                System.out.println("NM = Not Married");
                System.out.println("W = Widower");
                System.out.println("S = Separate");
                System.out.println("");
                System.out.print("Your marital status: ");
                    mStatus = scan.next();
                
                    if (mStatus.equalsIgnoreCase("m") ||
                       (mStatus.equalsIgnoreCase("nm")) ||
                       (mStatus.equalsIgnoreCase("w")) ||
                       (mStatus.equalsIgnoreCase("s"))){
                        mari = true;
                    }else{
                        System.out.println("Invalid marital status.");
                    }
                    if (mStatus.equalsIgnoreCase("m")){
                        mStatus = "Married.";
                    }else if (mStatus.equalsIgnoreCase("nm")){
                        mStatus = "Not Married.";
                    }else if (mStatus.equalsIgnoreCase("w")){
                        mStatus = "Widower.";
                    }else if (mStatus.equalsIgnoreCase("s")){
                        mStatus = "Separate.";
                    }

            }while (!mari);  
            
            System.out.println("\nYour datas\n");
            System.out.println("");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("Sex: " + sex);
            System.out.println("Marital status: " + mStatus);
    }

}
