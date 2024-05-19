public class StringcountPallindromicSubstring {
    public static void main(String[] args) {
         String s="abbaca";
        String a="";int c=0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j=i+1; j<=s.length();j++) {
                a= s.substring(i,j);
                if(isPallindrome(a))
                c++;
            }
        }
        System.out.println(c);
    }

    private static boolean isPallindrome(String a) {
        int start=0;
        int end =a.length()-1;
        while(start<=end){
            if(a.charAt(start)==a.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }

}
