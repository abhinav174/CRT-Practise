import java.util.*;
import java.util.Arrays;
public class Day2 {
    public static void main(String []args)
    {
        //1. Initialize an array and 2D array Retrieve output

        int []arr1 = {1,2,3,4,5,6};
        int [][]arr2 = {{0,1,2,3},{4,5,6,7}};
        System.out.println("Single Dimensional Array:");
        for (int j : arr1) {
            System.out.print(j);
        }
        System.out.println("\nDouble Dimensional array");
        for (int[] ints : arr2)
            for (int anInt : ints) System.out.print(anInt + " ");

        //2. Array Sort
        int []arraySort = {9,5,3,4,76,2,1};
        Arrays.sort(arraySort);
        System.out.println("\nSorted Array:"+Arrays.toString(arraySort));

        //3. Perform casting
        int a = 10;
        double d  = a;
        System.out.println("Implicit Type Casting:"+d);
        double x = 10.5698;
        int y = (int)x;
        System.out.println("Explicit Type Casting:"+y);
    }
}
