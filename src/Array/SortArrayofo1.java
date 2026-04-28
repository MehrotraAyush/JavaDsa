package Array;

// Sort an Array of 0s and 1s
// input ={1,0,1,1,0,0,1}
//output={0,0,0,1,1,1,1}

public class SortArrayofo1 {

    public static void sort(int []arr){
        int start=0,end=arr.length-1;
        while(start<=end){
            if(arr[start]==1&& arr[end]==0){
                arr[start]=0;
                arr[end]=1;
            }
            if (arr[start]==0) {
                start++;
            }
            if (arr[end]==1) {
                end--;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int []arr={1,0,1,1,0,0,1};
        sort(arr);
    }
}
