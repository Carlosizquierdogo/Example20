
import  java.util.Scanner;

public class Example20 {
    public static void main(String[] args) {
        int year;
        Scanner inputvalue;
        inputvalue = new Scanner(System.in);
        System.out.println("Enter your year");
        year = inputvalue.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(" Yep " + year + "  900" + "is indeed a leap year");


        else
            System.out.println(" No " + year + " " + " is not a leap  year ");

    }
}





