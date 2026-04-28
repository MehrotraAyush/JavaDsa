package Array;

import java.util.HashMap;

public class ModOfArray {
    public static int Mod(int []arr){
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

    public static void main(String[] args) {
        int []arr={1,2,2,3,3,3,4,4,5,5,5,5,5,5};
        System.out.println(Mod(arr));
    }
}
