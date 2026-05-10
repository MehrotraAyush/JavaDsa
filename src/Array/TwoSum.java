package Array;


// 481. Two Sum
public class TwoSum {
    public static void twosum(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if ((arr[i]+arr[j])==target){
                    System.out.println("Paires of Array : ("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={2,1,3,4,5,6};
        twosum(arr,10);
    }
}
