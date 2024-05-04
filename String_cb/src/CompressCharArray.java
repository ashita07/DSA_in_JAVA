import java.sql.SQLOutput;
import java.util.Arrays;

public class CompressCharArray {
    public static void main(String[] args) {
        char[] ch = {'a','a','b','c','c','c','d','e','e','e'};
        System.out.println(array(ch));

    }

    public static String array(char [] ch){
        int c=0;
        String s="";
        for(char j='a';j<='z';j++){
            for(int i=0;i<ch.length;i++){
                if(ch[i]==j){
                    c++;
                }
            }
            if(c==1){
                s=s+j;
                c=0;
            }
            else if(c>0){
                s=s+j+c;
                c=0;
            }
        }



        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }
    return Arrays.toString(ch);
    }


}
