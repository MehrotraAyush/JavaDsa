package Array;

public class Average {
    public static double average(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg=(double) sum/arr.length;
        return avg;
    }

    public static void main(String[] args) {
        int []arr={2,4,1,3};
        System.out.println("Average of Array "+average(arr));
    }
}
