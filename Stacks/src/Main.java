import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(32);
        st.push(33);
        st.push(55);
        st.push(55);
        st.push(55);
        System.out.println(st.peek());
        System.out.println(st.capacity());
        System.out.println(st);
        for(int a:st){
            System.out.println(a);
        }
    }
}