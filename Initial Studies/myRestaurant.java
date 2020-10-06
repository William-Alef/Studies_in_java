import java.text.DecimalFormat;
import java.util.Scanner;

import sun.awt.www.content.audio.basic;

public class exAula16 {
    public static void main(final String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        /*
        boolean validNumber = false;
        do {
            
            
            int i = 1;
            int max = 10;

            System.out.println("Counting to" + max);
            while (i <= max){
            System.out.println("The I value: " + i);
                i++;
            }
            System.out.println(i);
            
            do {
                ++i;   
                System.out.println("I value: " + i);
            } while(i < 15);
            System.out.println(i);
            */
            /*
            for(int i = 0; i < 5; i++){
                System.out.println("I value: " + i);

            }
            for(int i = 5; i > 0; i--){
                System.out.println("I value: " + i);

            }
            for(int i=0, j=0 ; i < j ; i++, j--){
                System.out.println("I: " + i +" J: " + j);

            }
            
            int count = 0;
            for (; count < 10 ; ){
                System.out.println("Count value: " + count);
                count += 2;
            
            
            }
            */
            /*
            System.out.println("Enter a number between 0 and 10");
            System.out.print("Enter a number: ");
                double number = scan.nextDouble();
            
            if ((number >= 0) && (number <= 10)){
                validNumber = true;
                System.out.print("Valid note: " + number);
            } else {
                System.out.println("Invalid note, try again ");
            }
        }while (!validNumber);
        */
        /*
        boolean equal = false;
        do{
            System.out.print("Enter your User: ");
                String name = scan.next();

            System.out.print("Enter your Password: ");
                String password = scan.next();
            System.out.println("");

            if (name.equalsIgnoreCase(password)){
                System.out.println("Enter a Password different from the user");
                System.out.println("");
            }
            else {
                System.out.println("Valid account.");
                break;
            }
        }while (!equal);
        */  /*
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
                *//*
            int cont = 0;   
            System.out.print("Type the first country: ");
                int pa = scan.nextInt();

            System.out.print("Type the first growth rate: ");
                double fR = scan.nextDouble();

            System.out.print("Type the second country: ");
                int pb = scan.nextInt();
            
            System.out.print("Type the second growth rate: ");
                double sR = scan.nextDouble();
            
            while (pa < pb){

                pa += (pa / 100) * fR;
                pb += (pb / 100) * sR;
                cont++;
            }
           System.out.println("A population: " + pa);
           System.out.println("B population: " + pb);
           System.out.println("Years: " + cont);
           *//*
        for (int i=1; i<= 20; i++){
            System.out.print(i + " ");
        }
        */
        /*
        int num;
        int min = Integer.MIN_VALUE;

        for (int i=0; i<5; i++){
            System.out.print("Enter a nuber: ");
            num = scan.nextInt();

            if (num > min){
                min = num;
            }
        }
        System.out.println("The bigger is: " + min);
        */  /*

        int num;
        int sum = 0;
        int average;

        for (int i=0; i<5; i++){
            System.out.print("Enter a nuber: ");
            num = scan.nextInt();

            sum += num;
        
        }
        average = sum/5;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
        */ /*
        for (int i=1; i<50; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        */
        /*
        int sum = 0;
        System.out.print("Enter a first number: ");
            int numb1 = scan.nextInt();

        System.out.print("Enter the second number: ");
            int numb2 = scan.nextInt();

        for (int i=numb1; i <=numb2; i++){
            System.out.println(i);
            sum += i;
        }
            
            int soma = sum;
            System.out.println("Total sum: " + soma);
        *//*
        System.out.print("Enter a first number: ");
            int numb1 = scan.nextInt();

            System.out.println("\nTaboo:  " + numb1);
            System.out.println("");
            for (int i=1; i <= 100; i++)
            System.out.println(numb1 +" X " + i + " = " + (numb1*i));    
        *//*
        int numb1;
        int numb2;


        System.out.print("Enter a number: ");
            numb1 = scan.nextInt();
        
        System.out.print("Enter the another number: ");
            numb2 = scan.nextInt();

            int result = numb1;
        for (int i=1; i<numb2; i++){
            result *= numb1;
        }
        System.out.println("Total: " + result);
        */
        /*
        int num;
        int odd = 0;
        int pair = 0;
        

        for (int i=0; i<10; i++){
            System.out.print("Enter a number: ");
            num = scan.nextInt();

            if (num % 2 == 0){
                pair++;
            }else {
                odd++;
            }
        }
        System.out.println("Pair's: " + pair);
        System.out.println("Odd's: " + odd);
        *//*
        for(int a=0, b=1, i=0; i<15; b+=a, a=b-a, i++) {
			System.out.print(a + " ");
		}  
		System.exit(0);
        *//*
        int num;
        int i = 0;

        System.out.print("Enter a number: ");
            num = scan.nextInt();

        int fac = 1;
        for (i=num; i>0; i--){
            fac *= i;
            System.out.println(i);
        }

        System.out.println(fac);
        *//*
        boolean mama = false;
        do {
            System.out.print("Enter a number: ");
                int num = scan.nextInt();

       
            if (num % 2 == 0){
                System.out.println("It's a pair number!.");
            }
            else {
                System.out.println("It's a odd number!.");
            }
            System.out.println("Do you want to try again? (Yes) or (Not)");
            System.out.print(": ");
                String tryy = scan.next();
            
            if (tryy.equalsIgnoreCase("Y") || (tryy.equalsIgnoreCase("Yes"))){ 
                mama = true;
            }else{
                System.out.println(" ");
                System.out.println("Heave a good day!");
            }

        }while(mama);
        *//*
        int aNotes;
        System.out.print("Enter the amount of banknotes: ");
            aNotes = scan.nextInt();

        double sum = 0;
        double mid;
        double note;

        for (int i=0; i<aNotes; i++){
            System.out.print("Enter the note: ");
                note = scan.nextDouble();
                sum += note;
        }
       mid = sum / aNotes;
       System.out.println("Sum: " + sum);
       System.out.println("Average: " + mid);
       *//*
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
        *//*
        int sum = 0;
        int clas;
        int stude;
        int avera;

        System.out.print("Enter a class numbers: ");
        clas = scan.nextInt();
        
        boolean retur = false;
        for (int i=0; i< clas; i++){
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
           */
            /*
        double much;
        double sum = 0; 
        double value;
        double avera;
        

        System.out.print("How much: ");
            much = scan.nextDouble();

        for (int i=0; i<much; i++){

            System.out.print("Enter the amount: ");
                value = scan.nextDouble();
                sum +=value;
        }
        avera = sum/much;
        System.out.println(" ");
        System.out.println("You bought: " + much);  
        System.out.println("Average per purchase: " + avera);
        */
        /*
        int count = 0;
        double price = 1.99;

        for(int i=0; i<=50; i++){
        
            System.out.println(i + " - $" + (price*i));
        }
        */
        /*
        double price;
        System.out.print("Enter the price: ");
            price = scan.nextDouble();

        System.out.println(" ");
        System.out.println("\tWelcome to Cursed Bakery\t");
        System.out.println(" ");

        for(int i=1; i<=50; i++){
            System.out.println(i+ " - US$ " + (price*i));
        }
        */
        /*
        int number; 
        boolean rep = false;
        do {
            System.out.print("Enter the number: "); 
                number = scan.nextInt();
            
            for(int a=0, b=1, i=0; i<number; b+=a, a=b-a, i++){
                System.out.print(number + "!= " + a + " ");
            }
            System.out.print("You try again (Y) or (N): ");
                String trya = scan.next();

            if ((trya.equalsIgnoreCase("Y") || (trya.equalsIgnoreCase("Y")))){
                rep = true;
            }
            else {
                System.out.println("Have a good day!");
                break;
            }
        }while(rep);
        */ /*
        double sum = 0;
        double nTemp;
        double temp;
        
        double bigger = Double.MIN_VALUE;
        double smaller = Double.MAX_VALUE;

        System.out.print("Enter the number of temperatures: ");
            nTemp = scan.nextDouble();

        System.out.println("");
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
        */ /*
        int number;
        System.out.print("Enter the number: ");
        number = scan.nextInt();
        System.out.println("");

        if ((number % 2) ==0){
            System.out.println("Is a pair number!");
        }else{
            System.out.println("Is a odd number");
        }
        *//*
        int number;
        int odd = 0;
        int pair = 0;
        boolean odds;

        System.out.print("Enter the number: ");
        number = scan.nextInt();

        for(int i=1;i<number; i++){

            odds = false;

            for(int j=2;j<number; j++){
                if (i % 2 == 0){
                    odds = true;
                }
            }
            if (!odds){
                System.out.println(i);
            }
        }
        *//*
        int nTable, sNumber, fNumber;
        boolean again = true;

        do{
            System.out.println(" ");
            System.out.print("Enter a table numble: ");
                nTable = scan.nextInt();
            System.out.print("Enter a initial number: ");
                sNumber = scan.nextInt();
            System.out.print("Enter a final number: ");
                fNumber = scan.nextInt();

            if (fNumber < nTable){
                again = false;
            }
        }while(!again);

            System.out.println("Table of: " + nTable);
            System.out.println("");
            
        for (int i=1; i<=fNumber; i++){
            System.out.println(nTable + " X " + i + " = " + (nTable*i));
        }
        if (fNumber < nTable){
            System.out.println("Please, typer a bigger number!");
            again = !true;
        }
        *//*

        double salary;
        double percen;
        double year1;
        double year2;

        System.out.print("Enter your salary: ");
            salary = scan.nextDouble();
        System.out.print("Enter a percentage: ");
            percen = scan.nextDouble();
        System.out.print("Enter the initial year: ");
            year1 = scan.nextDouble();
        System.out.print("Enter the last year: ");
            year2 = scan.nextDouble();

        DecimalFormat format = new DecimalFormat("###,###.##");
        for (double i=year1; i < year2; i++){

            percen *= 2;

            double calcul = (salary/100) * percen;

            //System.out.println("");
            System.out.println(i + " - Your salary: " + format.format(calcul + salary) + " = " + percen + "%");
        }
        */
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
 