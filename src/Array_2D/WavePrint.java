package Array_2D;
import java.util.*;
public class WavePrint {
    public static List<Integer> waveprint(int arr[][],int m,int n){
        List<Integer> al=new ArrayList<>();
        for(int col=0;col<n;col++){
            if (col%2!=0){
            // odd
            //  Bottom to up
                for(int row=m-1;row>=0;row--){
                    al.add(arr[row][col]);
                }
            }
            else{
            //even(top to Bottem
                for(int row=0;row<m;row++){
                    al.add(arr[row][col]);
                }
            }
        }
        System.out.println(al);
        return al;
    }

    public static void main(String[] args) {
    int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    waveprint(arr,4,4);
    }
}
