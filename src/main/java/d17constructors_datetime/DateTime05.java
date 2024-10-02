package d17constructors_datetime;

import java.time.LocalDate;
import java.time.Period;

public class DateTime05 {
    public static void main(String[] args) {

        // ornek 2: Verilen iki tarih arasindaki farki hesaplayan kodu yaziniz.
        // example 2: Write the code that calculates the difference between two given dates.

        // Java'da Period class'i, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.
        // Bu sınıf, iki LocalDate nesnesi arasındaki zaman farkını ifade eder ve java.time paketi içinde yer alır.
        // Period sınıfı, tarihler arasındaki farkları kolayca yönetmek ve manipüle etmek için çeşitli metodlar sağlar.

        // Kullanım Alanları
        // Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
        // veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
        // ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

        // Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
        // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period nesnesi olarak döndürür.

        LocalDate date01 = LocalDate.of(2001, 9, 30);
        LocalDate date02 = LocalDate.now();

        Period difference = Period.between(date01, date02);
        System.out.println(difference); // P23Y2D, 23Y: 23 yil, 2D: 2 ay

        // Ayri ayri görelim
        int yearDiffrerence = difference.getYears();
        int monthDiffrerence = difference.getMonths();
        int dayDiffrerence = difference.getDays();

        System.out.println(date02 + " ve " + date01 + " arasindaki fark : "); // 2024-10-02 ve 2001-09-30 arasindaki fark :
        System.out.println("Yil : " + yearDiffrerence); // Yil : 23
        System.out.println("Ay : " + monthDiffrerence); // Ay : 0
        System.out.println("Gün : " + dayDiffrerence); // Gün : 2

        // Instant
        // ZonedDateTime
        // Duration
        // Clock
    }
}
