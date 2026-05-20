package Array;

public class FirstRepeatingElement {
    public static int first(int [] nums){
        int num=-1;
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) {
                    num = nums[i];
                    return num;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int []arr={1,10,10,20,20,30,40,40};
        System.out.println(first(arr));
    }
}
