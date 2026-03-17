public class Student {
    // properties/fields/instance variable & behavior

    private String name; // instance variable

//    static void generictype.main(String[] args) {
//        String name; //local variable

    private int rollNumber;
    private int age;

    // constructor
//    public Student(){     // default constructor
//        this.age = 10;
//    }
    // parameterized constructor
    public Student(String name, int rollNumber, int age) {
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
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
        if (age < 0) {
            System.out.println("invalid age");
        } else {
            this.age = age;
        }
    }


    //     public void setAge(int x){
//         if(x < 0){
//             x = 0;
//         }
//         age = x;
//     }
//public void setAge(int age){
//    if(age < 0){
//        age = 0;
//    }
//    this.age = age;
//}
//    public int getAge(){
//        return this.age;
//    }

}
