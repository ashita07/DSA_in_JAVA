public class Print_substring_lengthwise {
    public static void main(String[] args) {
        String s="sample";
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i=j-len;
                System.out.println(s.substring(i,j));
            }
        }
    }
}
