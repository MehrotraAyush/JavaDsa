package String;

public class CountVovel {
    public static int countVovel(String str){
        int count=0;
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='A'||ch=='I'||ch=='E'||ch=='O'||ch=='U'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVovel("My Name Is Ayush Mehrotra"));
    }
}
