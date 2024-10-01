package d16methodcreation_overloading_varargs_passbyvalue;

public class CarRunner {
    public static void main(String[] args) {

        // 4- Car class’indan bir object uretelim

        Car car01 = new Car();
        System.out.println(car01.brand); // Honda
        System.out.println(car01.model); // Civic
        System.out.println(car01.year); // 2023
        System.out.println(car01.hybrid); // true

        car01.action(); // Honda hizli hareket eder.
        car01.stop(); // Honda güvenli bir sekilde durur.

        // 5- Car class’a donup, constructor olusturalim


    }
}
