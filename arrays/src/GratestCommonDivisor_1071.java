public class GratestCommonDivisor_1071 {
    public static void main(String[] args) {
        System.out.println(CommonD("ababab","abab"));
    }
    public static String CommonD(String str1,String str2){
        String ans="";int smallLen=0;
        if(str1.length()>str2.length()){
            smallLen=str2.length();
        }
        else smallLen=str1.length();

        for (int i = 0; i < smallLen; i++) {
            if(str1.charAt(i)==str2.charAt(i)){
                ans=ans+str1.charAt(i);
            }
            else break;
        }
       return ans;
    }
}
