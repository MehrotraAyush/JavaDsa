package String;

public class LowerCaseToUpperCase {
    public static String conver(String str){
        String str1="";
        if(str==null||str.isEmpty())
            return "";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                str1=str1+(char)(ch-32);
            }
            else
                str1=str1+ch;
        }
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(conver("My Name is Ayush Mehrotra"));
        System.out.println(conver(""));
        System.out.println(conver("If Nitesh is not behaving his self so he can't Switch"));
    }
}
