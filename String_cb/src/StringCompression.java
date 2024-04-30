public class StringCompression {
    public static void main(String[] args) {
        String s="ffjjkkklll";int c=0;
        StringBuilder str= new StringBuilder();
        for(char ch='a';ch<='z';ch++){
            for (int i = 0; i <s.length() ; i++) {
                if (s.charAt(i) == ch) {
                    c++;
                }
            }
            if(c>0)
            { str.append(ch).append(c);}
            c=0;
        }
        System.out.println(str);
    }
}
