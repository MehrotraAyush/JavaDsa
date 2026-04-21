package String;
import String.Reverse;

public class PalindromSting {
    public static void isPalindrom(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        if(s.equals(str))
            System.out.println("Palindrom String");
        else
            System.out.println("Not Palindrom String");
    }

    public static void main(String[] args) {
        isPalindrom("MaM");
    }
}
