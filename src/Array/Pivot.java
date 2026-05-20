package Array;

public class Pivot {
     public static int pivotIndex(int []nums){
         int n=nums.length;
         int [] LeftSum=new int[n];
         int [] RightSum=new int[n];

         LeftSum[0]=nums[0];
         for(int i=1;i<nums.length;i++)
             LeftSum[i]=LeftSum[i-1]+nums[i];

         RightSum[n-1]=nums[n-1];
         for (int i=n-2;i>=0;i--)
             RightSum[i]=RightSum[i+1]+nums[i];

         for(int i=0;i<n;i++){
             if(LeftSum[i]==RightSum[i]){
                 return nums[i];
             }
         }
         return -1;
     }

    public static void main(String[] args) {
        int []nums={13,17,20,-3,7,13,-18,-7,12,-13,5,9,17,-4,19};
        System.out.println(pivotIndex(nums));
    }
}
