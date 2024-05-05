public class Stack {

       private int[] arr;
       private int idx;

       public Stack(){
           arr=new int[5];
       }
       public Stack(int n){
           arr=new int[n];
       }
       public boolean isEmpty() {
           return idx == 0;
       }
       public boolean isFull(){
           return idx==arr.length;
       }
       public void push(int item) throws Exception{
           if(isFull())
               throw new Exception("stack is full");
           arr[idx] = item;
           idx++;
       }
       public int size(){
           return idx;}
    public int peek(){
           return arr[idx-1];
    }

       public int  pop() throws Exception{
           if(isEmpty())
           throw new Exception("stack is empty");
           idx--;
           return arr[idx];
       }
       public void display() throws Exception{
           if(isEmpty())
               throw new Exception("stack is empty");
           for (int i = 0; i <idx; i++) {

               System.out.print(arr[i]+" ");
           }
           System.out.println();
       }
        }
