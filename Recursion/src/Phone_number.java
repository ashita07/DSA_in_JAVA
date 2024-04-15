import java.util.ArrayList;
import java.util.List;

public class Phone_number {
    static String[] key ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
  List<String> ll=new ArrayList<>();
        String ques="24";
        Combinations(ques,"",ll);
        System.out.println(ll);
    }

    public static void Combinations(String ques,String ans,List<String> ll ){
         if(ques.isEmpty()){
             ll.add(ans);
         return ;}
      char ch=ques.charAt(0);
         String press =key[ch - '0'];
         for(int i=0;i<press.length();i++){
            Combinations(ques.substring(1),ans + press.charAt(i),ll);
        }
            }
        }



