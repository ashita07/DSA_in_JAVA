public class MergeAlternateStrings {
    public static void main(String[] args) {
        System.out.println(merge("abcd","efghijkl"));
    }
    public static String merge(String w1,String w2){
        String str="";int p1=0,p2=0;
        while(w1.length()!=p1 && w2.length()!=p2){
            str=str+w1.charAt(p1)+w2.charAt(p2);
            p1++;
            p2++;
        }
        if(w1.length()>w2.length()){
            str=str+w1.substring(p1);
        }
        else{
            str=str+w2.substring(p2);
        }
        return str;
    }

}
