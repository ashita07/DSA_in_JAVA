import java.util.Scanner;

public class PlayingWithGoodStrings {
            public static void main(String args[]) {
            // Your Code Here
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int c=0;
            int ans=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' ){
                    c++;
                }
                else{
                    ans=Math.max(ans,c);
                    c=0;
                }
            }
            System.out.println(ans);
        }
}
