public class LInkedListClient {
    public static void main(String[] args) throws Exception {
        LinkedList ll= new LinkedList();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddLast(4);
        ll.AddLast(55);

        ll.AddIndex(2,80);
        ll.AddIndex(2,500);
        ll.Display();
//        System.out.println(ll.removeFirst());
//        System.out.println(ll.removeEnd());
        System.out.println(ll.removeIndex(3));
        ll.Display();
        System.out.println(ll.size());

    }
}
