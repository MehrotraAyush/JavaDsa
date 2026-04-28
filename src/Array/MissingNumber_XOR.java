package Array;

public class MissingNumber_XOR {

    public static int missingNumber(int []arr){
        int XorSum=0;
        for(int num:arr){
            XorSum=XorSum^num;
        }
        for(int i=0;i<=arr.length;i++){
            XorSum=XorSum^i;
        }
        return XorSum;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,5,0};
        System.out.println(missingNumber(arr));
    }
}
