public class Encapsulation {
    public static void main(String[] args) throws Exception {
        Parent p= new Parent("papa",40);
//        System.out.println(p.parentName);
//        System.out.println(p.parentAge);
  p.setName("kamlesh");
        System.out.println("hello");
  p.setAge(-3);
        System.out.println("hell");
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println("hell");
        
    }
}
