package Day10;

public class SelectionSort {
    public int SLargest(int[] a)
    {
        int n = a.length;
        int largest = a[n-1];
        for(int i = n-1;i>=0;i--)
        {
            if(a[i] != largest )
            {
                return a[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();

        int[] arr1 = {85,23,6,7,2,99,41};
        int n = arr1.length;
        int temp =0;
        for(int i = 0;i<n-1;i++)
        {
            int smallest =i;
            for(int j = i+1;j<n;j++)
            {
                if(arr1[smallest] > arr1[j])
                {
                    smallest = j;
                }
            }
            temp = arr1[i];
            arr1[i] = arr1[smallest];
            arr1[smallest] = temp;
        }
        System.out.println("Ascending Order: ");
        for(int i =0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nDescending  Order: ");
        for(int i =n-1;i>=0;i--)
        {
            System.out.print(arr1[i]+" ");
        }


        int result = s.SLargest(arr1);
        System.out.println("\nSecond Largest Element: "+result);
    }
}
