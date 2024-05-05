import java.util.Stack;

public class addLast {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        addLast( st,0);
        System.out.println(st);
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
