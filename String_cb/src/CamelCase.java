public class CamelCase {
    public static void main(String[] args) {
        String s="IAmACompetitiveProgrammer";
        int a=0;
        for(int i=1;i<s.length();i++){
            for(char ch='A';ch<='Z';ch++){
               if(s.charAt(i)==ch){
                   System.out.print(s.substring(i));

               }
            }
        }
    }
}
