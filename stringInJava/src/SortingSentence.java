import java .util.*;
public class SortingSentence {

    public static void main(String[] args)
    { String s= "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s)
    {
   String [] str = s.split(" ") ;
   String [] arr= new String[str.length];

   for(String t:str)
   {
       int n = t.length();
       int pos=t.charAt(n-1)-48;
       arr[pos-1]=t.substring(0,n-1);
   }
   StringBuilder g= new StringBuilder();

   for(String t:arr)
   {
       g.append(t);
       g.append(" ");
   }
return g.toString().trim() ;
    }
}