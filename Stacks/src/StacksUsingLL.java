
import java.util.LinkedList;
public class StacksUsingLL{
    private LinkedList<Integer> ll;
    public StacksUsingLL(){
        ll=new LinkedList<>();
    }
   public boolean isEmpty(){
        return ll.size() == 0;
   }
   public void push(int item){
        ll.addFirst(item);
   }
   public int pop(){
       return ll.removeFirst();
   }
   public int peek(){
        return ll.getFirst();
   }
   private void display(){
       System.out.println(ll);
   }

    public static void main(String[] args) {
        StacksUsingLL st=new StacksUsingLL();
        st.push(10);
        st.push(20);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();
        System.out.println( st.peek());
        System.out.println(  st.pop());
        st.display();

    }
}