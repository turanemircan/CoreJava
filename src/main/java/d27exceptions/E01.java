package d27exceptions;

public class E01 {
    public static void main(String[] args) {

        /*
        Exception: Kod çalıştırıldığında akışı bozan hatalardır. "Beklenmedik sorunlar" demektir.
        Her exception, hata mesajını ve hata türüne ait bilgiyi içinde bulundurur.

        1- exception (İstisnalar), normal kod yürütme akışını bozan hatalardir.

        2- exception bir classtir. Methodlari vardir. Kendi icinde hata kodlari, bilgi mesajlari vardir.

        Ornegin; Bir classtaki bir method cagirildigi zaman kod calismaya baslar. Bu andan itibaren kodlar satir satir
        okunmaya baslar. Ve kodlarda bir hata varsa, exception durumu olusur.

        Tabi bu hatalari developer onceden ongorup handler etmeli, duzeltmelidir ama kullanici programimizi
        kullanirken ongorulmeyen durumlar her zaman olusabilir. Bir hata olustugunda neden kaynaklandigini
        ogrenip cozmek, o an cozulemiyorsa da sistemin durmayip calismasinin devam etmesi icin alternatif
        cozumler uretmek gerekiyor

        3- Bir exception oluştuğunda, kod yürütme durur. Exception'lar, hata ayıklama günlüklerinde(log) oturum açar.
        */

        /*
        4- Exception Handling, Java'da, akışı kesintiye uğratmadan kodumuzdaki istenmeyen istisnaları
        veya sorunları işlememize olanak tanıyan bir yöntemdir

        5- Exception denince akliniza 3 seyin gelmesi lazim. try, catch ve finally (optional).

        6- Kod başarılı bir şekilde çalışmadığında bile, kullanıcı deneyiminin sorunsuz olmasını sağlamak için,
        tüm yürütmeleri bir try catch ifadesine sarmak programlama dünyasında en iyi uygulama olarak kabul edilir.
        Ancak, tüm kodları körü körüne try-catch blokları içine almak her zaman en iyi pratik değildir.
        Bu, hataları maskeleyebilir ve programın gerçek hataları gizlemesine yol açabilir.

        https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
        */

        // 1) ArithmeticException : Matematik kurallarinda herhangi bir hata yaparsaniz bu exception’i alirsiniz

        // division(5, 0);
        // division02(8, 2);
        division03(3, 0);
    } // Main Disi

    public static void division(int num01, int num02) {
        if (num02 == 0) {
            System.out.println("Lutfen sifir girmeyiniz.");
        } else {
            System.out.println(num01 / num02);
        }
    }

    // try-catch kullandiginizda sistem tarafindan “try” bolumu calistirilir,
    // eger “try” bolumunde hata ile karsilasilmazsa “catch” blogu hic calismaz
    // Eger “try” bolumunde hata ile karsilasilirsa hata alinan satirda calisma durdurulur
    // ve “catch - yakalamak” bolumu calismaya baslar.

    public static void division02(int num01, int num02) {
        try {
            System.out.println(num01 / num02);
            System.out.println("try icin gorev tamamlandi.");
        } catch (ArithmeticException e) {
            System.out.println("Lutfen sifira bölme islemi yapmayiniz.");
        }
        System.out.println("Try sonrasi kod, akisina devam ediyor.");
    }

    // Throw Exceptions : a/b gibi islem sirasinda degilde, istenmeyen durumu gorunce hatayi biz olusturalim
    public static void division03(int num01, int num02) {
        try {
            if (num02 == 0) {
                throw new ArithmeticException("Sifira bolme hatasi");
            }
        } catch (ArithmeticException e) {
            System.out.println("Lutfen sifira bölme islemi yapmayiniz.");
        }
        System.out.println("Try sonrasi kod, akisina devam ediyor.");
    }
}
