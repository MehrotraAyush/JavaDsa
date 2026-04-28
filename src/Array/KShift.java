package Array;

public class KShift {

    public static void RightShift(int []arr,int k) {
        if(k==0||arr.length==0)
            return;

        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        RightShift(arr,k-1);
    }
    public static void LeftShift(int []arr,int k){
        if(k==0||arr.length==0) {
            return;
        }
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++)
            arr[i] = arr[i + 1];
        arr[arr.length-1]=temp;

        LeftShift(arr,k-1);
    }

    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70};
//        RightShift(arr,2);
        LeftShift(arr,3);
        for(int num:arr)
            System.out.print(num+" ");
    }
}
