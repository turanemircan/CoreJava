package d18datetime_stringbuilder;

public class Sb03 {
    public static void main(String[] args) {

        // 1-reverse(): StringBuilder Object’inin içeriğini ters çevirir.String class’ta yoktur.

        StringBuilder sb01 = new StringBuilder("Java is easy");
        System.out.println(sb01); // Java is easy

        sb01.reverse();
        System.out.println(sb01); // ysae si avaJ

        // -------------------------------------------------------------------------------------

        // 2- deleteCharAt(int index): Belirtilen konumda(index’te) bulunan karakteri siler.

        sb01.deleteCharAt(1);
        System.out.println(sb01); // yae si avaJ

        // -------------------------------------------------------------------------------------

        // 3- delete(int start - dahil , int end - haric): Belirtilen aralıktaki karakterleri siler.

        sb01.delete(0, 2);
        System.out.println(sb01); // e si avaJ

        // -------------------------------------------------------------------------------------

        // 4-replace(int start-dahil, int end-haric, String str): Belirtilen indexteki karakterleri verilen stringle değiştirir.

        sb01.replace(0, 2, "hasan");
        System.out.println(sb01); // hasansi avaJ

        // -------------------------------------------------------------------------------------

        // 5-insert(int offset, String str): Belirtilen konumdan itibaren verilen stringi ekler.
        // Buradaki offset, eklemenin başlayacağı konumu belirtir ve aslında bir index görevi görür.

        sb01.insert(2, "34");
        System.out.println(sb01); // ha34sansi avaJ

        // -------------------------------------------------------------------------------------

        // 6-compareTo() metodunun görevi, iki StringBuilder Objesini karşılaştırmaktır.
        // int değeri döndürür.Sozluk gibidir.Eğer iki StringBuilder nesnesi birbirine eşitse, 0 döndürür.
        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden önce geliyorsa, negatif deger döndürür.
        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden sonra geliyorsa, pozitif deger döndürür.
        // Farkli olan iki harfin ascii kodlari arasindaki farki verir.
        // Ornegin; Bu sifir ve birler if'ler icerisinde kullanilarak iki Object arasindaki iliski belirlenmis olur.
        // Kelimelerin sözlük sıralamasını belirleyebilirsiniz, kelimeleri alfabetik sıraya göre sıralayabilirsiniz.
    }
}
