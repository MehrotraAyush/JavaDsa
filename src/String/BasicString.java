package String;

public class BasicString {

    public static void printEachChar(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            count++;
        }
        System.out.println("Total Number of Character in "+str+" is "+count);
    }
//  count length of String Without using Length Function

    public static int getLength(String str){
        char []arr=str.toCharArray();
        int len=arr.length;
        return len;
    }
    public static void main(String[] args) {
        printEachChar("Ayush");
        System.out.println("Length of String "+getLength("ayush"));
    }
}
