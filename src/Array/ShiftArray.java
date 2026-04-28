package Array;

public class ShiftArray {

    public static void RightShift(int []arr) {
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println("After Right Shifting Array");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void LeftShift(int []arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++)
            arr[i] = arr[i + 1];
        arr[arr.length-1]=temp;
        System.out.println("After Left Shifting Array");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70};
        RightShift(arr);
        LeftShift(arr);
    }
}
