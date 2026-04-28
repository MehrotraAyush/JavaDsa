package Bitwise;

public class Swap {
    public static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping : a="+a+" b="+b);
    }

    public static void main(String[] args) {
        swap(10,12);
    }
}
