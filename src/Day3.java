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

    }
}
