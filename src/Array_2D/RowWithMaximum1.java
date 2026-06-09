package Array_2D;

public class RowWithMaximum1 {
    public static int getFirstOccIndex(int [][] arr,int rowIndex){
        int totalRow= arr.length;
        int totalColumn=arr[0].length;
        int target=1;
        int ans=-1;

        if(arr[rowIndex][totalColumn-1]==0)
            return totalColumn;
        else{
            int s=0;
            int e=totalColumn-1;

            while (s<=e){
                int mid=s+(e-s)/2;

                if(arr[rowIndex][mid]==0)
                    s=mid+1;
                else{
                    ans=mid;
                    e=mid-1;
                }
            }
        }
        return ans;
    }
    public static int rowWithMax1(int [][]arr){
        int totalRow= arr.length;
        int totalCol=arr[0].length;
        int maxi=-1;
        int maxiRow=-1;

        for(int i=0;i<totalRow;i++){
            int firstOccIndex=getFirstOccIndex(arr,i);
            int oneCount=totalCol-firstOccIndex;

            if(oneCount!=0 && oneCount>maxi){
                maxiRow=i;
                maxi=oneCount;
            }
        }
        return maxiRow;
    }
    public static void main(String[] args) {
        int [][] arr={{0,0,0,0},{0,0,0,1},{0,0,1,1},{0,1,1,1},{1,1,1,1}};
        System.out.println(rowWithMax1(arr));
    }
}
