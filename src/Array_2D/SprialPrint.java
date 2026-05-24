package Array_2D;

import java.util.ArrayList;
import java.util.List;

public class SprialPrint {
    public static List<Integer> Sprial(int arr[][]){
        List<Integer> al=new ArrayList<>();
        int m= arr.length;
        int n=arr[0].length;

        int startRow=0;
        int endRow=m-1;
        int startCol=0;
        int endCol=n-1;

        while (startRow<=endRow && startCol<=endCol){
            //RowWise Left to Right (Starting Col- ending col)
                for(int col=startCol;col<=endCol;col++){
                    al.add(arr[startRow][col]);
                }
                startRow++;
            //ColWise top to Bottem (starting row - ending Row)
                for(int row=startRow;row<=endRow;row++){
                    al.add(arr[row][endCol]);
                }
                endCol--;
            //RowWise Right to Left (ending col -starting col)
            //validation
            if(startRow<=endRow) {
                for (int col = endCol; col >= startCol; col--) {
                    al.add(arr[endRow][col]);
                }
                endRow--;
            }
            //ColWise Bottem to up (ending row -starting col)
            if(startCol<=endCol) {
                for (int row = endRow; row >= startRow; row--) {
                    al.add(arr[row][startCol]);
                }
                startCol++;
            }
        }
        System.out.println(al);
        return al;
    }

    public static void main(String[] args) {
    int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    Sprial(arr);
    }
}
