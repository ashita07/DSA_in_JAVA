public class LinkedList {
    class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public void AddFirst(int item){
        Node nn= new Node();
        nn.val=item;
        if(size==0){
            head = nn;
            tail=nn;
            size++;
        }else{
            nn.next=head;
            head =nn;
            size++;
        }
    }

    public void AddLast(int item){
        if(size==0){
            AddFirst(item);
        }else{
            Node nn=new Node();
            nn.val=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public int getFirst(){
        return head.val;
    }
    public int getLast(){
        return tail.val;
    }

    public void AddIndex(int k,int item) throws Exception {
        if(k==0){
            AddFirst(item);
        }else if(k== size){
            AddLast(item);
        }else{
            Node nn= new Node();
            nn.val=item;
            Node prev =getNode(k-1);
            nn.next=prev.next;
            prev.next=nn;
            size++;
        }
    }

    private Node getNode(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("range me dedo");
        }
        Node temp = head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }

    public void Display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val + "-->");
            temp =temp.next;
        }
        System.out.println(".");
    }
}
