package Array;

public class Sum {

    public static void printSum(int []arr){
        int pos=0,neg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
                pos+=arr[i];
            else
                neg+=arr[i];
        }
        System.out.println("Sum of Positive Integer "+pos);
        System.out.println("Sum of Negative Integer "+neg);
    }

    public static void main(String[] args) {
        int []arr={2,-3,-1,4,6,-9};
        printSum(arr);
    }
}
