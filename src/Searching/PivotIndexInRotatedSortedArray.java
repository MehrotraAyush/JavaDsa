package Searching;

public class PivotIndexInRotatedSortedArray {
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

    public static void main(String[] args) {
        int arr[]={50,60,70,10,20,30,40};
        int arr1[]={1,2,3,4,5};
        System.out.println(pivot(arr1));
    }
}
