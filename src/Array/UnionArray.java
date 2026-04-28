package Array;

import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int []brr={2,5,6,7};
        HashSet<Integer> hs=new HashSet<>();
        for(int num:arr){
            hs.add(num);
        }
        for(int num:brr){
            hs.add(num);
        }
        System.out.println(hs);
    }
}
