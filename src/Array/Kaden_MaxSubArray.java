package Array;

public class Kaden_MaxSubArray {
    public static int maxSubArray(int []nums){
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            maxi=Math.max(sum,maxi);
            if(sum<0)
                sum=0;
        }
        return maxi;
    }

    public static void main(String[] args) {
        int [] num={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));
    }
}
