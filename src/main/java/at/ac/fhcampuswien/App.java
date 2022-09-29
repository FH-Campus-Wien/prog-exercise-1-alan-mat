package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        String nl = System.lineSeparator();
        String str = new StringBuilder()
                .append("0123456789012345678901").append(nl)
                .append("         __").append(nl)
                .append(" _(\\    |@@|").append(nl)
                .append("(__/\\__ \\--/ __").append(nl)
                .append("   \\___|----|  |   __").append(nl)
                .append("       \\ }{ /\\ )_ / _\\").append(nl)
                .append("       /\\__/\\ \\__O (__").append(nl)
                .append("      (--/\\--)    \\__/").append(nl)
                .append("      _)(  )(_").append(nl)
                .append("     `---''---`")
                .toString();
        System.out.println(str);
    }

    //todo Task 3
    public void sumOfLiterals(){
        char z = 'Z';
        int intHex = 0xFACE;
        int num = 012;
        long longNum = 80L;
        float fourfour = 44e-1f;
        float fivefive = 5.5f;
        double eighteight = 8.88e1;
        double ninenine = 99.9;
        int sum = z + intHex + num + (int)longNum + (int)fourfour + (int)fivefive + (int)eighteight + (int)ninenine;
        System.out.println(sum);
    }

    //todo Task
    public void addTwoNumbers(){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }

    //todo Task 5
    public void swapTwoNumbers(){
        System.out.println("Before Swap:");
        int x, y;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("x: ");
            x = sc.nextInt();
            System.out.print("y: ");
            y = sc.nextInt();
        }
        y = y+x;
        x = y-x;
        y = y-x;
        System.out.println("After Swap:");
        System.out.println("x: "+x+System.lineSeparator()+"y: "+y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("n1: ");
            int n1 = sc.nextInt();
            System.out.print("n2: ");
            int n2 = sc.nextInt();
            if(n1 == n2){
                System.out.println("n1 == n2");
                return;
            }
            if(n1 > n2){
                System.out.println("n1 > n2");
                return;
            }
            System.out.println("n2 > n1");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter annual Revenue: ");
            int rev = sc.nextInt();
            /*
            Ausführung mittels privater Methode, um
            unzählige if-else Verzweigungen zu vermeiden :)
             */
            System.out.println(rating(rev));
        }
    }

    private String rating(int rev){
        if(rev >= 0 && rev < 20000)
            return "Poor Sales Revenue";
        if(rev >= 20000 && rev < 50000)
            return "Average Sales Revenue";
        if(rev >= 50000 && rev < 80000)
            return "Good Sales Revenue";
        if(rev >= 80000 && rev < 100000)
            return "Excellent Sales Revenue";
        /*
        Man könnte statt dem letzten if einfach "Invalid Revenue" zurückgeben
        weil alle andere Fälle bereits abgearbeitet wurden.
        Lasse ich drinnen, weil OR Operator in der Aufgabenstellung gefragt wurde.
         */
        if(rev < 0 || rev >= 100000)
            return "Invalid Revenue";
        return null;
    }

    //todo Task 8
    public void getCommissionRate(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter CommissionClass: ");
            int cc = sc.nextInt();
            float provision;
            switch (cc){
                case 1:
                    provision = 0.01f;
                    break;
                case 2:
                    provision = 0.02f;
                    break;
                case 3:
                    provision = 0.03f;
                    break;
                case 4:
                    provision = 0.04f;
                    break;
                default:
                    provision = 0;
            }
            //%n macht das selbe wie System.lineSeparator()
            //warum wird 0.0 getestet und nicht 0.00 wie bei allen anderen outputs ? macht keinen sinn
            if(provision == 0) {System.out.printf("Your Commission Rate was set to %.1f%n", provision); return; }
            System.out.printf("Your Commission Rate was set to %.2f%n", provision);
        }
    }

    //todo Task 9
    public void leapyear(){
        int year;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Year: ");
            year = sc.nextInt();
        }
        if((year % 4) != 0){
            System.out.println("Not a Leapyear");
            return;
        }
        if((year % 100) == 0 && (year % 400) != 0){
            System.out.println("Not a Leapyear");
            return;
        }
        System.out.println("Leapyear");
    }

    //todo Task 10
    public void transposedNumbers(){
        int n, f=0;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Number: ");
            n = sc.nextInt();
        }
        //für NUR 3 ziffern könnte man es auch so zusammenfassen:
        //int f = (n % 10 * 100)+(n % 100 / 10 * 10)+(n/100);
        while(n != 0) {
            int lastDigit = n % 10;
            f = (f * 10) + lastDigit;
            n /= 10;
        }
        System.out.println(f);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}