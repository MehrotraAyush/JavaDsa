package Searching;

public class NonDuplicate {
    public static int NonDuplicate(int [] arr){
        int s=0;
        int e=arr.length-1;

        while (s<=e){
            int mid=s+(e-s)/2;

            if(s==e)
                return arr[s];

            int currentValue=arr[mid];
            int prev=-1;

            if(mid-1>=0)
                prev=arr[mid-1];

            int nextValue=-1;
            if(mid+1<arr.length)
                nextValue=arr[mid+1];

            if (currentValue!=prev  && currentValue!=nextValue)
                return currentValue;

            if (currentValue!=prev && currentValue ==nextValue) {
                int startingIndexPair=mid;

                if(startingIndexPair%2!=0)
                    e=mid-1;
                else
                    s=mid+1;
            }
            else if (currentValue==prev &&currentValue!=nextValue) {
                int endingIndexPair=mid;

                if(endingIndexPair%2!=0)
                    s=mid+1;
                else
                    e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,5,5,7,6,6};
        System.out.println(NonDuplicate(arr));
    }
}
