public class test {

    static void main(String[] args) {
//        Student student = new Student();
//        student.setAge(-20);
//        System.out.println(student.getAge());

//        BankAccount bankAccount = new BankAccount();
//        bankAccount.setAccountNumber(32323);
//        bankAccount.deposit(-10);
//        bankAccount.withdraw(10);
//        bankAccount.deposit(100);
//        bankAccount.withdraw(10);
//        System.out.println(bankAccount.getBalance());

        // constructors
        Student student = new Student("Ansh", 454, 20);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getRollNumber());
    }
}
