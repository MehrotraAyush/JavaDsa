package Pattern.Hollow_Pattern;

import java.util.Scanner;

public class HollowRectangle {
    public static void PrintHollowRectangle(int r,int c){
        for(int row=1;row<=r;row++) {
            for (int col = 1; col <= c; col++) {
                if (row == 1 || row == r || col == 1 || col == c)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows and Columns in Rectangle");
        int r=sc.nextInt();
        int c=sc.nextInt();
        PrintHollowRectangle(r,c);
    }
}
