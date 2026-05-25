package Searching;

public class GetLowerBond {
    public static int getBond(int arr[],int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;

        while (s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]>=target){
                ans=mid;
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,30,30,30,40};
        int target=35;
        System.out.println(getBond(arr,target));
    }
}
