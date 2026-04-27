package Array;

public class CountZeroOne {
    public static void zeroOne(int []arr){
        int zero=0,one=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0&&arr[i]<10)
                one++;
            else
                zero++;
        }
        System.out.println("Total No of One's "+one);
        System.out.println("Total No of Zero's "+zero);
    }

    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,1};
        zeroOne(arr);
    }
}
