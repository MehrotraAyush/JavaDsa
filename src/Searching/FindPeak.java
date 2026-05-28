package Searching;

public class FindPeak {

    public static int findPeak(int arr[]){
        int ans=-1;
        int n=arr.length;
        int s=0;
        int e=n-1;

        while (s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else {
                //arr[mid]>=arr[mid+1]
                ans=mid;
                e=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={0,2,5,3,1};
        System.out.println(findPeak(arr));
    }
}
