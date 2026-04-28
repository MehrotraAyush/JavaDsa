package Bitwise;

public class EvenOdd {
    public static void evenorodd(int num){
        if((num&1)==1)
            System.out.println("Odd Number");
        else if ((num&1)==0) {
            System.out.println("Even Number");
        }
    }

    public static void main(String[] args) {
        evenorodd(214);
        evenorodd(1009);
    }
}
