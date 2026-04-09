package Pattern.Hollow_Pattern;

import java.util.Scanner;

public class HollowTriangle {
    public static void printHollowTriangle(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                if(row==n||col==1||row==col)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter No Of Rows");
        int n=sc.nextInt();
        printHollowTriangle(n);
    }
}
