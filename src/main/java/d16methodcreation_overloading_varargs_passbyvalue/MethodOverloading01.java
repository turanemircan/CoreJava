package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {

        /*
        Polymorphism:
        Method Overloading (static polymorphism) + Method Overriding(dynamic polymorphism)

        OOP'nin (Object Oriented Programming-Nesne yönelimli programlama) prensiplerinin biridir.
        Polymorphism (cok bicimlilik) demektir.
        Bir method'u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.

        i.Method Overloading : Java'da Method Overloading (Metot Aşırı Yükleme), aynı class içerisinde
        aynı isme sahip ancak farklı parametre listelerine sahip birden fazla metodun tanımlanması işlemidir.
        */

        // String s = "Java";
        // s.substring(int beginIndex); ==> tek parametre almis
        // s.substring(int beginIndex, int endInndex); ==> iki parametre almis
        add(3, 5);
        add(3.1, 2.1);

        // -------------------------------------------------------------------------------------

        String str = "Java";
        // str.substring() = Bu methodu bir String objesi üzerinden cagiririz. Boyle methodlara non-static denir.

        // Math.min() => Bu methodu direkt class adiyla cagirdik. Boyle metotlara static denir.


    } // Main dışı

    // ornek 1 : Toplama islemi yapan bir method olusturun ve sonra da overload edin.
    // example 1 : A method that performs an addition operation create and then overload

    public static void add(int num01, int num02) {
        System.out.println(num01 + num02);
    }

    public static void add(double num01, double num02) {
        System.out.println(num01 + num02);
    }

    public static void add(double num01, int num02) {
        System.out.println(num01 + num02);
    }

    public static void add(int num01, double num02) {
        System.out.println(num01 + num02);
    }

    public static void add(int num01, int num02, int num03) {
        System.out.println(num01 + num02 + num03);
    }

    /*
    Method Overloading'de sadece parametreler degistirilir.
    Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.

    Method Overloading icin;
    a) Parametre sayisini degistirebilirsiniz.
    b) Parametre data tiplerini degistirebilirsiniz.
    c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
    d)Method overloading olustururken return type'in, access modifier'in,
       static veya non-static olmanin hicbir etkisi yoktur.

    Soru 1: private method'lar overload edilebilir mi?

    Cevap 1: private method'lar overload edilebilirler cunku;
    overload islemi tek class icinde yapilir, private methodlar ayni class'in icinden
    ulasilabilir oldugundan overload'a engel degildir.

    Soru 2: static method'lar overload edilebilir mi?
    Cevap 2: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.
    */
    // -------------------------------------------------------------------------------------

}
