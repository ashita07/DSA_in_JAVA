public class Parent {
   private String parentName="Pawan";
    private int parentAge=50;
    public Parent(String name,int age) {
        parentName=name;
       parentAge =age;
    }
    public void setName(String name){
      this.parentName=name;
    }
    public String getName(){
        return this.parentName;
    }

public void setAge(int age) {
    try {
        if (age < 0) {
            throw new Exception("age is -ve");
        }
        this.parentAge = age;
    } catch (Exception e) {
    e.printStackTrace();
    }
}
    public int getAge(){
        return this.parentAge;
    }
}
