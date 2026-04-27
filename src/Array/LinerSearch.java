package Array;

public class LinerSearch {
    public static boolean search(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr={2,5,3,1,7};
        System.out.println(search(arr,9));
    }
}
