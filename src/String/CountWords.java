package String;

public class CountWords {
    public static int countWords(String str){
        if(str==null||str.isEmpty())
            return 0;

        String [] words=str.trim().split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("My Name is Ayush Mehrotra   "));
        System.out.println(countWords("My Name is Ayush Mehrotra"));
        System.out.println(countWords(""));
    }
}
