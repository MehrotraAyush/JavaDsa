package Array;

public class ArrayBasic {

    public static int AddAllElement(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int MulAllElement(int arr[]){
        int mul=1;
        for(int i=0;i<arr.length;i++){
            mul*=arr[i];
        }
        return mul;
    }
    public static void ManMin(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Maximum Number "+max);
        System.out.println("Minimum Number "+min);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(AddAllElement(arr));
        System.out.println(MulAllElement(arr));
        ManMin(arr);
    }
}
