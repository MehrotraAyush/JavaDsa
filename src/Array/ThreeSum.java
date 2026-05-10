package Array;

import java.util.*;

public class ThreeSum {
    public static List<Integer> threeSum(int arr[],int target){
        List<Integer> output=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=i+2;k<arr.length;k++){
                    if ((arr[i]+arr[j]+arr[k])==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        output.addAll(temp);
                        System.out.println(output);
                        return output;
                    }
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,1,5};
        threeSum(arr,11);
    }
}
