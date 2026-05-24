package Array_2D;

public class Rotate90Clockwise {

    public static void rotate(int arr[][],int n){
        // Step1: Transpose of Matrix
        for(int row=0;row<n;row++){
            for(int col=row+1;col<n;col++){
                //swap
                int temp=arr[row][col];
                arr[row][col]=arr[col][row];
                arr[col][row]=temp;
            }
        }
        //Step 2:Reverse All Rows
        for(int i=0;i<n;i++){
            int start=0;
            int end=n-1;
            while (start<=end){
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;

                start++;
                end--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr,3);
    }
}
