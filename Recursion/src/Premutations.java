public class Premutations {
    public static void main(String[] args) {
        String p="abc";
        Permutation( p,"");

    }

    public static void Permutation(String p,String ans) {
         if(p.isEmpty()){
             System.out.println(ans);
             return ;
         }
        for (int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            String s1=p.substring(0,i);
            String s2=p.substring(i+1);
            Permutation(s1+s2,ans+ch);
        }
    }
}
