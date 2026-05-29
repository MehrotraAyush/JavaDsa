package Searching;

public class PaintersPartitionProblem {

    public static boolean isValid(int arr[],int k,int max){
        int paintercount=1;
        int board=0;

        for(int i=0;i<arr.length;i++){
            if(board+arr[i]<=max){
                board=board+arr[i];
            }
            else{
                paintercount++;
                if(paintercount>k || arr[i]>max){
                    return false;
                }
                else{
                    board=0;
                    board=board+arr[i];
                }
            }
        }
        return true;
    }

    public static int minTime(int [] boards,int k){
        if(boards.length==0){
            return -1;
        }
        int s=0;
        int sum=0;
        for(int i=0;i<boards.length;i++){
            sum=sum+boards[i];
        }
        int e=sum;
        int ans=-1;

        while (s<=e){
            int mid=s+(e-s)/2;

            if(isValid(boards,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        System.out.println(minTime(arr,2));
    }
}
