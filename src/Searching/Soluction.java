package Searching;

public class Soluction {
        public static int pivot(int arr[]){
            int n=arr.length;
            int s=0;
            int e=n-1;
            int ans=-1;
            if(arr[0]<arr[n-1])
                return ans;

            while(s<=e){
                int mid=s+(e-s)/2;

                if(arr[mid]<=arr[n-1]){
                    e=mid-1;
                }
                else{
                    ans=mid;
                    s=mid+1;
                }
            }
            return ans;
        }

        public static int binary(int arr[],int start,int end,int target){
            int s=start;
            int e=end;

            while(s<=e){
                int mid=s+(e-s)/2;

                if(arr[mid]==target)
                    return mid;
                else if(arr[mid]>target)
                    e=mid-1;
                else
                    s=mid+1;

            }
            return -1;
        }
        public static int search(int[] nums, int target) {

            int pivotIndex=pivot(nums);
            int n=nums.length;

            if(pivotIndex==-1){
                int ans= binary(nums,0,n-1,target);
                return ans;
            }

            int startArray1=0;
            int endArray1=pivotIndex;
            if(target>=nums[startArray1] && target<=nums[endArray1]){
                int ans=binary(nums,startArray1,endArray1,target);
                return ans;
            }


            int startArray2=pivotIndex+1;
            int endArray2=n-1;

            if(target>=nums[startArray2] && target<=nums[endArray2]){
                int ans=binary(nums,startArray2,endArray2,target);
                return ans;
            }

            return -1;
        }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }
}
