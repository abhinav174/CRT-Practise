import java.lang.Math;
import java.util.*;
public class Day3 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        //1. Write a code to perform math function: sqrt,max,min,abs,pow,round,random
        System.out.println(Math.sqrt(36));
        System.out.println(Math.max(36,54));
        System.out.println(Math.min(2,4));
        System.out.println(Math.abs(-124));
        System.out.println(Math.pow(5,2));
        System.out.println(Math.round(36.54));
        System.out.println((int)(Math.random()*1000));

        //2. Write a code --- 1st scan 2 variables a and b then use comparison operators and conditional statements and retrieve the output

        System.out.println("\nEnter the values");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("\nComparison Operators");
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println("\nConditional Statements");
        if(a<50 && b<50)
        System.out.println("Both are less than 50");
        else if(a>50 && b>50)
            System.out.println("Both are greater than 50");
        else
            System.out.println("\nLite Tesuko");

        //3. Switch Statement
        System.out.println("Switch Statement");
        System.out.println("1. Enter 1 for Monday");
        System.out.println("2. Enter 2 for Tuesday");
        System.out.println("3. Enter 3 for Wednesday");
        System.out.println("4. Enter 4 for Thursday");
        System.out.println("5. Enter 5 for Friday");
        System.out.println("6. Enter 6 for Saturday");
        System.out.println("7. Enter 7 for Sunday");
        System.out.println("Enter the choice");
        int choice = in.nextInt();
        switch(choice){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");

        }
    }
}
