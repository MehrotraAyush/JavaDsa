package Array;

public class Reverse {

    public static void reverse(int [] arr){
        int start=0,end=arr.length-1;
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int even[]={2,4,6,8,10};
        reverse(even);
        for(int num:even){
            System.out.print(num+" ");
        }
    }
}
