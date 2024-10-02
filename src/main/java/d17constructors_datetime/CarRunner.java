package d17constructors_datetime;

public class CarRunner {
    public static void main(String[] args) {

        // 4- Car class’indan bir object uretelim

        // 9- Default Car() icine parametre girelim

        Car car01 = new Car("BMW", "3.20", 2024, false);
        System.out.println(car01.brand); // Honda // BMW
        System.out.println(car01.model); // Civic // 3.20
        System.out.println(car01.year); // 2023 // 2024
        System.out.println(car01.hybrid); // true // false

        car01.action(); // Honda hizli hareket eder.
        car01.stop(); // Honda güvenli bir sekilde durur.

        // 5- Car class’a donup, constructor olusturalim

        // 10- Baska bir object uretelim ve direkt objeyi yazdiralim
        Car car02 = new Car("Audi", "A4", 2018, false);
        System.out.println(car01); // reference alindi // Car{brand='BMW', model='3.20', year=2024, hybrid=false}
        System.out.println(car02); // reference alindi // Car{brand='Audi', model='A4', year=2018, hybrid=false}

        // 11- Reference durumunu duzeltmek icin Car class’a tostring methodu ekleyelim
        // Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.

        // 16- Yeni bir object uretelim
        Car car03 = new Car("Mercedes", "CLA 200"); // Geri kalan parametrelere default olan atanacak
        System.out.println(car03); // Car{brand='Mercedes', model='CLA 200', year=2023, hybrid=true}

    }
}
