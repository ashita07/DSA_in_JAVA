public class LInkedListClient {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddLast(4);
        ll.AddLast(55);
        ll.Display();
        System.out.println(ll.getFirst());
    }
}
