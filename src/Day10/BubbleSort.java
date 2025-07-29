package Day10;

//Bubble sort runs or iterates for n-1 times,
//it finds the biggest number first and pushes it to the last of the array
// Time complexity is O(n^2)
// It takes the element and compares it with the next element and
// if the next element is greater then it performs a swap operation

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,8,3,9,5,73,4,8};
        int n = arr.length;
        int temp =0;
        for(int i =0;i<n-1;i++)
        {
            for(int j =0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
