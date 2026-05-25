package Sorting;

public class InserctionSort {

    public static int [] inserction(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int currValue=arr[i];
            int prev=i-1;

            //Shifting
            while (prev>=0 && currValue<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //Placing
            arr[prev+1]=currValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,3,2,2,4};
        inserction(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
