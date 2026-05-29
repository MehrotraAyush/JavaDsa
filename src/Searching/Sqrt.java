package Searching;

public class Sqrt {
    public static double findSqrt(int n){
        double ans=-1;
        int s=1;
        int e=n;

        if(n==0){
            return 0;
        }

        while(s<=e){
            int mid=s+(e-s)/2;

            if(mid==n/mid){
                return mid;
            }
            else if (mid > n/mid) {
                e=mid-1;
            }
            else{
                ans=mid;
                s=mid+1;
            }
        }

        double factor=1;
        int totalPresison=3;

        for(int round=1;round<=totalPresison;round++){
            factor=factor/10;
            for(int i=1;i<=10;i++){

                double newAns=ans+factor;

                if(newAns*newAns==n){
                    return newAns;
                }
                else if (newAns*newAns<=n) {
                    ans=newAns;
                }
                else
                    break;
            }

        }
        ans=Math.round(ans*1000.0)/1000.0;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findSqrt(56));
    }
}
