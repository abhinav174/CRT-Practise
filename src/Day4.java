public class Day4 {
    public static void main(String [] args){
        //1. Solid Rectangle
        int n=4;
        int m =5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");

        //2. Hollow Rectangle
        for(int i=1;i<=4;i++) {
            System.out.print("*");
            if (i == 1 || i == 4) {
                for (int j = 1; j <= 4; j++) {
                    System.out.print("*");
                }
            }

            if (i == 2 || i == 3) {
                for (int j = 1; j <=4; j++) {
                    if (j == 3)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println("\n");

        //3. Half Pyramid
        for(int i =1;i<=4;i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

