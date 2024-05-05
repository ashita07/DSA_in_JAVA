public class Stacck_client {
    public static void main(String[] args) throws Exception {
        Stack s=new Stack();

        s.push(20);
        s.push(20);
        s.push(20);
        s.push(20);
        s.push(20);

        s.display();
        System.out.println(s.pop());
        s.display();
    }
}
