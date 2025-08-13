package RecursionProblems;
//genqtechsolutionsinfo@gmail.com
//
public class Maze {
    public static int countPath(int n, int m, int i , int j){
        if(i >= n && j>=m){
            return 0;
        }
        int countDown = countPath(n,m,i+1,j);
        int countRight = countPath(n,m,i,j+1);
        return countDown+countRight;
    }

    public static void main(String[] args) {
        int result = countPath(3,3,0,0);
        System.out.println(result);
    }
}
