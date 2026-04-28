package Bitwise;

public class IsPowerOf2 {
    public static int countSetBit(int num){
        int count=0;
        while(num!=0){
            if((num&1)!=0)
                count++;
            num=num>>1;
        }
        return count;
    }
    public static boolean isPowerOf2(int num){
        int n=num-1;
        if((num&n)==0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        // Basic Approch
        int n=countSetBit(16);
       if(countSetBit(16) == 1)
           System.out.println("Power of 2");
       else
           System.out.println("Not Power of 2");
       //
        System.out.println(isPowerOf2(16));
        System.out.println(isPowerOf2(21));
    }
}
