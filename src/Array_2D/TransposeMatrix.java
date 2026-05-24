package Array_2D;

public class TransposeMatrix {
    public static int [][] transpose(int arr[][]){

        if(arr==null||arr.length==0){
            return new int [0][0];
        }
        // for Original Array
        int m=arr.length;
        int n=arr[0].length;

        //For New Array
        int ans[][]=new int[n][m];

        //Actual Logic
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[j][i]=arr[i][j];
            }
        }

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2},{3,4},{5,6}};
        transpose(arr);
    }
}
