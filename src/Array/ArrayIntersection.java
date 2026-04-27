package Array;

import java.util.HashSet;

public class ArrayIntersection {
    public static void arrayIntersection(int []arr,int []brr){
        HashSet<Integer> hs=new HashSet<>();

        for(int num:arr){
            hs.add(num);
        }

        System.out.println("Intersection :");
        for(int num:brr){
            if(hs.contains(num)){
                System.out.print(num+" ");
                hs.remove(num);
            }
        }
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int [] brr={4,4,3,9,7,10,8};
        arrayIntersection(arr,brr);
    }
}
