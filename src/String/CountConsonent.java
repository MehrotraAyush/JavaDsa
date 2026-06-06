package String;

public class CountConsonent {
    public static int count(String str){
        int count=0;

        if(str==null||str.isEmpty())
            return 0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("My Name is Ayush Mehrotra"));
        System.out.println(count("My Name is Ayush Mehrotra 12#"));
        System.out.println(count(""));
    }
}
