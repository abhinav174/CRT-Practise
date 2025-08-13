package RecursionProblems;

public class TowerOfHanoi {
    public static void TowerHanoi(int n , String src, String helper, String dest)
    {
        if(n==1){
            System.out.println("Move Disk 1 from "+src+" to "+dest);
            return;
        }
        TowerHanoi(n-1,src,dest,helper);
        System.out.println("Move Disk "+n+" from "+src+" to "+dest);
        TowerHanoi(n-1,helper,src,dest);
        System.out.println("Move Disk "+n+" from "+src+" to "+dest);

    }
    public static void main(String[] args) {
    int x =3;
    TowerHanoi(x,"S","H","D");
    }
}
