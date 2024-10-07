package d19stringbuilder_buffer_accessmodifier_static;

public class Student02Runner {
    public static void main(String[] args) {

        System.out.println("Student02.stdName = " + Student02.stdName); // Ali Can

        Student02 ali = new Student02();
        System.out.println("ali.age = " + ali.age); // ali.age = 18

        Student02.staticMethod(); // Ben static bir methodum
        ali.nonStaticMethod(); // Ben non-static bir methodum
    }
}
