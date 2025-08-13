package RecursionProblems;
import java.util.*;
public class Subsets {
    public static void subsets(int [] nums, int idx, List<Integer> curr){
        if(idx == nums.length){
            System.out.println(curr);
            return ;
        }
        curr.add(nums[idx]);
        subsets(nums,idx+1,curr);
        curr.remove(curr.size()-1);
        subsets(nums,idx+1,curr);
    }

    public static void main(String[] args) {
        int n =3;
        int[] nums = new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i] = i+1;
        }
        subsets(nums,0,new ArrayList<>());
    }
}
