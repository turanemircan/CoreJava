package d10loops;

public class ForLoops01 {
    public static void main(String[] args) {

        // Döngüler (Loops) tekrar eden kodlama işlerini kolaylaştırmak için kullanılır.
        // Tüm kod parçalarını belirli bir kural döngüsü içinde tekrarlamak için kullanılır.

        /*
        Java'da su donguleri gorecegiz

        1. for-loop
        2. while-loop
        3. do-while-loop
        4. for-each-loop (Collections'larda)

        1. for-loop

        for döngüsü, temel olarak bir kod blogunu belirli bir sayıda ve üst üste çalıştırmak
        için kullanılan bir döngüdür.
        Döngü başlangıcında kullanılan değişkene döngü içinde müdahale edilerek tekrar sayısı değiştirilebilir.

        for döngüsü, yineleme(iteration) sayısı bilindiğinde belirli döngüler için kullanılır.
        Bazi durumlarda döngü sonsuz sayıda yinelenir
        */

        // ornek 1: Console'a 4 kere 'Hi!' yazdirin
        // example 1: Type 'Hi!' 4 times in the console

        // 1.Yol: Tavsiye edilmez.Not recommended

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        System.out.println("----------------------------------------------");

        // 2. Yol:

        /*
        for (Baslangic degeri; Loop calisma Kurali; Artirma/ Eksiltme) {
            Calisacak Kodlar
        }
        */

        // Baslangic degeri; Loop calisma kurali; Artirma / Eksiltme

        for (int i = 0; i < 4; i++) {
            System.out.println("Hi");
        }

        System.out.println("----------------------------------------------");

        // -------------------------------------------------------------------------------------

        // Ornek 2: 20(dahil) den 3(dahil) e kadar tum tamsayilari console’a yazdiriniz.
        // Example 2: Write all integers from 20(inclusive) to 3(inclusive) to console

        for (int i = 20; i >= 3; i--) {
            System.out.print(i + " "); // 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3
        }

        System.out.println();

        // Ornek 3: 3'den 20'ye kadar tum cift sayilari console’a yazdiriniz(20 dahil)
        // Example 3: Write all even numbers from 3 to 20 to the console (including 20)

        for (int i = 3; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " "); // 4 6 8 10 12 14 16 18 20
            }
        }

        // 2. yol:
        System.out.println("\n----------------------------------------------");
        for (int i = 4; i < 21; i += 2) {
            System.out.print(i + " ");
        }
    }
}
