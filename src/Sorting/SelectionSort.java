package Sorting;

public class SelectionSort {
    public static int [] selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                int min=arr[i];
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
    int arr[]={5,6,4,1,3};
    selection(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
