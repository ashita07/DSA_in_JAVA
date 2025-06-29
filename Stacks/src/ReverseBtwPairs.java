import java.util.Stack;
public class ReverseBtwPairs {
    public static void main(String[] args) {
String s=reverseParentheses("(dcba)");
        System.out.println(s);
    }
    public static String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                st.push(s.charAt(i));
            else if(s.charAt(i)==')'){
                String temp="";
                while(st.peek()!='('){
                    temp+=st.pop();

                }
                st.pop();
                for(int j=0;j<temp.length();j++){
                    st.push(temp.charAt(j));
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String ans ="";
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        String reversed=new StringBuilder(ans).reverse().toString();
        return reversed;
    }
}
