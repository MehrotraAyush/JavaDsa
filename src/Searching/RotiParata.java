package Searching;

public class RotiParata {
    public static boolean isValidAns(int totalPartha,int [] cock,int totalCocks,int timeLimit){
        int parathacount=0;
        for(int i=0;i<cock.length;i++){
            int currentcockRank=cock[i];
            int timetaken=0;
            int j=1;

            while (timetaken<=timeLimit){
                if(timetaken+ j*currentcockRank <=timeLimit){
                    timetaken=timetaken+j*currentcockRank;
                    parathacount++;
                    j++;
                }
                else{
                    break;
                }
            }

            if (parathacount>=totalPartha)
                return true;
        }
        return false;
    }
    public static int MinTimeToCockParatha(int p,int [] cock,int n){
        // p-> no of paratha
        // n-> no of cock

        int ans=-1;
        int s=0;
        int maxRank=-1;
        for(int i=0;i<cock.length;i++){
            if(cock[i]>maxRank)
                maxRank=cock[i];
        }

        //R*(n*(n+1)/2  R=>maxRank n-> no of parathas
        int e=maxRank*(p*(p+1)/2);

        while (s<=e){
            int mid=s+(e-s)/2;

            if(isValidAns(p,cock,n,mid)){
                ans=mid;
                e=mid-1;
            }
            else
                s=mid+1;
        }

        return ans;
    }
}
