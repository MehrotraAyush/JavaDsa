package Array_2D;

public class BinarySearch {
    public static boolean search(int [][] matrix,int target){

        int totalRow=matrix.length;
        int totalColumn=matrix[0].length;
        int n=totalRow*totalColumn;

        int s=0;
        int e=n-1;

        while (s<=e){
            int mid=s+(e-s)/2;
            int rowIndex=mid/totalColumn;
            int colIndex=mid%totalColumn;

            if(matrix[rowIndex][colIndex]==target)
                return true;

            else if (matrix[rowIndex][colIndex]>target)
                e=mid-1;
            else
                s=mid+1;
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] arr={{1,3,5,7},{10,11,16,20},{22,30,34,60}};
        System.out.println(search(arr,332));
    }
}
