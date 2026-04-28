package Bitwise;

public class Bitwise {
    public static void main(String[] args) {
        int a=5,b=6;
        System.out.println(" BitWise And :"+(a&b));
        System.out.println(" BitWise Or :"+(a|b));
        System.out.println(" BitWise Xor :"+(a^b));
        System.out.println(" BitWise Not :"+(~a));
        System.out.println("Left Shift of 5 from 1 to 10 position");
        for(int i=1;i<=10;i++){

            System.out.print((a=a<<1)+" ");
        }
        System.out.println();
        a=100;
        System.out.println("Right Shift of 5 from 1 to 10 position");
        for(int i=1;i<=10;i++){
            System.out.print((a=a>>1)+" ");
        }
    }
}
