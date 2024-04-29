public class Main {
    public static void main(String[] args) {
        System.out.println("before static as static is formed after" +
                " object is encountered");
        Student s = new Student();
        s.name="rajesh";
        s.age=33;
        s.oops();
        s.sayHey();
         Student.MentorName("anushka");

    }
    static{
        System.out.println("hello from static block of main class");
    }
}
//pehele main ka static block chalega
//fir statements execute honge
//fir jaha bhi class ka object encounter hoga
// vaha uska static block chalega sabse pehele