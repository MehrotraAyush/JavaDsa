package String;

public class FrequencyOfCharacter {
    public static int count(String str,char ch){
        if (str==null||str.isEmpty())
            return 0;

        int count=0;
        for(int i=0;i<str.length();i++){
            char ab=str.charAt(i);
            if(ab==ch)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("My Name Is Ayush Mehrotra",'A'));
    }
}
