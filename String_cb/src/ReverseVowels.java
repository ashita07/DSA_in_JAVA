import java.util.Arrays;

public class ReverseVowels {
    public static void main(String[] args) {

        System.out.println(ReverseString("hello"));
    }

    public static String ReverseString(String s) {

        int start=0;int end =s.length()-1;
  char[] ch=s.toCharArray();
while(start<end){
    if(!vowel(s.charAt(start))){
        start++;
    }
    else if(!vowel(s.charAt(end))){
        end--;
    }
    else{
       char a=ch[start];
        ch[start]=ch[end];
        ch[end]=a;
       start++;
        end--;
    }
}
return String.valueOf(ch);

    }
    public static boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }else{
            return false;
        }
    }

}
