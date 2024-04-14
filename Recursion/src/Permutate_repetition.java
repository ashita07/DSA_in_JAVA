public class Permutate_repetition {
    public static void main(String[] args) {
        String s="abca";
        Permutate(s,"");

    }

    public static void Permutate(String s,String ans) {

        if(s.isEmpty()){
            System.out.print(ans+" ");
            return ;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);int value=0;
          for(int j=i+1;j<s.length();j++){
              if(ch==s.charAt(j)){
                  value=1;
                  break;
              }
          }
           if(value==0) {
               String s1 = s.substring(0, i);
               String s2 = s.substring(i + 1);
               Permutate(s1 + s2, ans + ch);
           }
        }

    }
}
