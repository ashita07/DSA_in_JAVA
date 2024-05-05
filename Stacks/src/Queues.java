public class Queues {
    private int[] arr;
    private int size;
    public Queues(){
        arr=new int[5];
    }
    public Queues(int n){
        arr=new int[n];
    }
    public boolean isEmpty(){
        return arr.length==0;
    }
    public boolean isFull(){
        return arr.length==size;
    }
    public void enqueue(){

    }
}
