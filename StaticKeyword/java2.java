public class test {
    static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
       Student.getCount();
       int c = sum(1 , 2);
        System.out.println(c);
        System.out.println(Utils.max(1,22));
        System.out.println(Utils.min(1,22));

    }

    public static int sum(int a , int b ){
        return a + b;
    }
}
// static member cannot use non - static data member or call non - static metho directly
// static block use for static intialization
