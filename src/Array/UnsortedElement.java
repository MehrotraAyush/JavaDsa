package Array;

public class UnsortedElement {
    public static int increasingUnsorted(int []arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i+1]<=arr[i])
                return arr[i+1];
        };
        return -1;
    }
//    public static int decreasingUnsorted(int []arr){
//
//    }

    public static void main(String[] args) {
        int []arr={2,3,4,5,2,3};
        System.out.println(increasingUnsorted(arr));
    }
}
