package String;

public class RemoveAllSpace {
    public static String remove(String str){
        String str1="";

        if(str==null||str.isEmpty())
            return "";

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' ')
                str1=str1;
            else
                str1=str1+ch;
        }
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(remove("My Name is Ayush Mehrotra"));
        System.out.println(remove(""));
    }
}
