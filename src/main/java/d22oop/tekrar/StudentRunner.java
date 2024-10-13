package d22oop.tekrar;

public class StudentRunner {
    public static void main(String[] args) {

        Student student01 = new Student();
        System.out.println(student01.name); // Ali Can
        System.out.println(student01.getAge()); // 13
        System.out.println(student01.isSuccessful()); // true

        student01.setAge(25);
        System.out.println(student01.getAge()); // 25

        student01.setSuccessful(false);
        System.out.println(student01.isSuccessful()); // false
    }
}
