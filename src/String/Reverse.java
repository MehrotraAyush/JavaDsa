package String;

public class Reverse {
    public static void ReverseString(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        System.out.println("Reverse of Given String is "+s);
    }

    public static void main(String[] args) {
        ReverseString("Mam");
    }
}
