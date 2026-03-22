public class Student {

    public static int count = 0;

    static{       // static block
        System.out.println("hello");
    }

    public Student(){
        count++;
    }

    private int id;
    private String name;
    public int age;

    private int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getCount(){
        System.out.println("total students: "+ count);
    }
}
