package Bitwise;

public class UniqueNumber {
    public static int unique(int []arr){
        int unique=0;
        for(int num:arr){
            unique^=num;
        }
        return unique;
    }

    public static void main(String[] args) {
        int []arr={10,20,30,40,30,20,10};
        int n=unique(arr);
        System.out.println(n);
    }
}
