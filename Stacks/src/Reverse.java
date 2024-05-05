import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int x=st.pop();
        reverse(st);
        addLast(st,x);
    }
    public static void addLast(Stack<Integer> st,int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }

        int x=st.pop();
        addLast(st,item);
        st.push(x);
    }
}
