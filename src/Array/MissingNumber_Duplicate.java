package Array;
import java.util.*;

public class MissingNumber_Duplicate {
    public static List<Integer> FindDuplicate(int [] nums){
        List<Integer> ans=new ArrayList<>();

        //Marking
        int n=nums.length;
        for(int i=0;i<n;i++){
            int value=Math.abs(nums[i]);
            int pos=value-1;
            if(nums[pos]>0){
                nums[pos]=-nums[pos];
            }
        }
        // Traverse an Array Wheneven we see postive Number we Return pos +1

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int [] nums={1,4,4,5,2,2};
        FindDuplicate(nums);
    }
}
