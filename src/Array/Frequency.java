package Array;

import java.util.HashMap;

public class Frequency {

    public static int HightestFreq(int []arr){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int maxFreq=-1,maxFreqKey=-1;
        for(int key:map.keySet()){
            if(key>maxFreq){
                maxFreq=map.get(key);
                maxFreqKey=key;
            }
        }
        return maxFreqKey;
    }

    public static int LowestFreq(int []arr){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int minFreq=Integer.MAX_VALUE,minFreqKey=Integer.MAX_VALUE;
        for(int key:map.keySet()){
            if(key<minFreq){
                minFreq=map.get(key);
                minFreqKey=key;
            }
        }
        return minFreqKey;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5};
        System.out.println("Maxmimum Frequency Element is : " + HightestFreq(arr));
        System.out.println("Lowest Frequency Element is : " + LowestFreq(arr));

    }

}



