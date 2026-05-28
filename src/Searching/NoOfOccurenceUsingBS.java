package Searching;

public class NoOfOccurenceUsingBS {
    public static int getBond(int arr[],int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=n;

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
    public static int getUpperBond(int arr[],int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=n;

        while (s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<=target){
                s=mid+1;
            }
            else{
                ans=mid;
                e=mid-1;
            }
        }
        return ans;
    }

    public static int occurence(int arr[],int target){
        int upper=getUpperBond(arr,target);
        int lower=getBond(arr,target);

        return upper-lower;
    }

    public static void main(String[] args) {
        int arr[]={8,9,10,12,12,12};
        System.out.println(occurence(arr,12));
    }
}
