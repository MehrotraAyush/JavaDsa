package Searching;

public class EKO_SPOJ {
    public static boolean isValidAns(int [] tree,int n,int max){
        int woodCollected=0;

        for(int i=0;i<tree.length;i++){
            if(tree[i]>max){
                int curr=tree[i]-max;
                woodCollected=woodCollected+curr;
            }
        }
        if(woodCollected>=n)
            return true;
        return false;
    }
    public static int MaxSawHeight(int [] tree,int n){

        int x=tree.length;
        int s=0;
        int ans=-1;

        int max=-1;
        for(int i=0;i<x;i++){
            if(tree[i]>max)
                max=tree[i];
        }
        int e=max;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(isValidAns(tree,n,mid)){
                ans=mid;
                s=mid+1;
            }
            else
                e=mid-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr={20,15,10,17};
        System.out.println(MaxSawHeight(arr,7));
    }
}
