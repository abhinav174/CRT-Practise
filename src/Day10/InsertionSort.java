package Day10;

public class InsertionSort {
    void sort(int arr[])
    {
        for(int i=1;i<arr.length;++i)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j= j-1;
            }
            arr[j+1] = key;
        }
    }
    static void printArray(int arr[])
    {
        for(int i =0;i<arr.length;i++)
            System.out.println(arr[i]+" ");

        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {12,11,13,5,6};
        InsertionSort s = new InsertionSort();
        s.sort(arr1);
        printArray(arr1);
    }
}
