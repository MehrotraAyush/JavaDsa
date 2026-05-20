package Array;

public class Remove_Duplicate {
    public static int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int n=nums.length;

        while (j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else {
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int []arr={1,10,10,20,20,30,40,40};
        System.out.println(removeDuplicates(arr));
    }
}
