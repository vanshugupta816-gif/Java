public class School {

    private static School school;

    private School() {
    }

    public static School getInstance() {
        if (school == null) {
            school = new School();
        }
        return school;
    }
}
