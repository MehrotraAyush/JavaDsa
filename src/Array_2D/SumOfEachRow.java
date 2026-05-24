package Array_2D;
import java.util.*;

public class SumOfEachRow {
    public static List<Integer> rowSum(int [][]arr){
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            al.add(sum);
        }
        return al;
    }
    public static List<Integer> columnSum(int [][]arr){
        List<Integer> al=new ArrayList<>();
        int maxcol=0;
        for(int []row:arr){
            if(row.length>maxcol) {
                maxcol = row.length;
            }
        }
        for(int col=0;col<maxcol;col++){
            int sum=0;
            for(int row=0;row<arr.length;row++){
                if(col<arr[row].length){
                    sum=sum+arr[row][col];
                }
            }
            al.add(sum);
        }
        return al;
    }

    public static void main(String[] args) {
        int [][]arr={{1},{2,2},{3,3,3}};
        List<Integer> sol=new ArrayList<>();
        sol=columnSum(arr);
        System.out.println(sol);
    }
}
