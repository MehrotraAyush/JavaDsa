package Array;

public class Array2D {
    public static void printArray(int [][]brr){
        for(int i=0;i< brr.length;i++){
            int col=brr[i].length;
            for(int j=0;j<col;j++){
                System.out.print(brr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void AllMullArray(int [][] brr){
        int sum=0,Mul=1;
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<brr[i].length;j++){
                sum+=brr[i][j];
                Mul*=brr[i][j];
            }
        }
        System.out.println("Sum of All Element of Array "+sum);
        System.out.println("Multiplication of All Element of Array "+Mul);
    }
    public static void main(String[] args) {
        //zaged Array

        int [][] brr={
                {1,2},
                {2,3,4,5},
                {3,4,5,6,7,8},
                {9}
        };
        AllMullArray(brr);
        printArray(brr);
    }
}
