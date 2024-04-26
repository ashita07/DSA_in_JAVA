public class Leetcode121 {
    public static void main(String[] args) {
        String s="the sky is blue";
       s= s.trim();
       s=s+" ";
       String nw_str= " ";
       String fstr="";
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if (ch == ' ') {
              fstr=nw_str+fstr;
              nw_str= " ";
           }
           else
           {  nw_str=nw_str+ch;}

       }
        System.out.println(fstr.trim());
    }
}
