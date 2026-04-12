
// lambda expression connects
public class Test2 {
    static void main(String[] args) {
        Student engineeringStudent = new Student() {

            @Override
            public String getBio(String name) {
                return name + " is Engineering Student ";
            }
        };

        Student lawStudent =  name -> {
            return name + " is law student";
        };
//        String bio = engineeringStudent.getBio("Ansh");
//        System.out.println(bio);
//        EngineeringStudent engineeringStudent = new EngineeringStudent();
//        String ansh = engineeringStudent.getBio("Ansh");
//        System.out.println(ansh);

    }
}
