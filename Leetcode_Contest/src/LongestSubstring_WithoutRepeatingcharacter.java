

public class LongestSubstring_WithoutRepeatingcharacter {
    public static void main(String[] args) {
        String s="aabcdedd";
        String a="";int c=0;int max=Integer.MAX_VALUE;
        for (int i = 0; i <s.length() ; i++) {
            for (int j=i+1; j<=s.length();j++) {
                a= s.substring(i,j);
                max=Math.max(a.length(),max);
            }
        }
    }
}
