package Searching;
import java.util.*;

public class AggressiveCows {
    public static boolean isValidAns(int stalls[],int k,int min){
        int cowcount=1;

        int lastPosition=0;
        for(int i=0;i<stalls.length;i++){
            if(stalls[i]-stalls[lastPosition]>=min){
                cowcount++;
                lastPosition=i;
            }
            if(cowcount==k){
                return true;
            }
        }
        return false;
    }
    public static int aggressiveCows(int [] stalls,int k){
        Arrays.sort(stalls);
        int n=stalls.length;

        int start=0;
        int end=stalls[n-1]-stalls[0];
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(isValidAns(stalls,k,mid)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        int stalls[]={1,2,8,4,9};
        int k=3;
        System.out.println(aggressiveCows(stalls,k));
    }
}
