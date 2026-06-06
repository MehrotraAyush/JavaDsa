package String;

public class IsContainsOnlyDigit {
    public static boolean isDigit(String str){
        if(str==null||str.isEmpty())
            return false;
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isDigit("Ayush"));
        System.out.println(isDigit(""));
        System.out.println(isDigit("12837"));
    }
}
