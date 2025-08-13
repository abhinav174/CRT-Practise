package Contests;

import java.util.Scanner;

public class Comparing3Nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int alice = 0;
        int bob = 0;
        int i =0;
        for(i = 0;i<3;i++)
        {
            arr1[i] = in.nextInt();
        }

        for(i = 0;i<3;i++)
        {
            arr2[i] = in.nextInt();
        }
        for(i =0;i<3;i++)
        {
            if(arr1[i]<arr2[i])
                bob++;
            else if(arr1[i] == arr2[i]) {
                bob += 0;
                alice += 0;
            }
            else
                alice++;
        }
        System.out.println(alice+" "+bob);
    }
}
