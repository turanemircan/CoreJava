package d18datetime_stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        // capacity() methodu, ayrılmış olan ve henüz kullanılmayan karakter alanının büyüklüğünü ifade eder.
        // Buradaki “karakter” kavramıyla kastedilen şey, Java’daki char veri tipindeki karakterlerdir.
        // char veri tipi, Java’da Unicode karakterleri temsil etmek için kullanılır ve
        // her bir char 2 byte (16-bit) yer kaplar.

        StringBuilder sb02 = new StringBuilder();
        System.out.println(sb02.length()); // 0
        System.out.println(sb02.capacity()); // 16

        sb02.append("Java");
        sb02.append("xxxxxxxxxxxxxxx");
        System.out.println(sb02.length()); // 4 // 19
        System.out.println(sb02.capacity()); // 16 // 34 (2 katinin 2 fazlasi)

        /*
        capacity Java'nin size verdigi data depolama yer sayisidir,
        length ise size verilen data depolama yerinin kullanilan kismidir

        ==>Java  baslangic olarak size capacity 16 olarak verir,
        Siz eger verilen bu capacity'i asarsaniz Java yeni capacity'i var olanin 2 katinin 2 fazlasi olacak sekilde ayarlar
        16==> 16*2+2 = 34,  34 ==> 34*2+2 = 70  …..
        */

        // -------------------------------------------------------------------------------------

        // Default Capacity'yi (16 karakter) nasil degistirebiliriz?

        StringBuilder sb03 = new StringBuilder(3); // Constructor kismina int yazilirsa capacity sayilir.
        System.out.println(sb03.append("Alis"));
        System.out.println(sb03.capacity()); // 2 Katının 2 Fazlası, 8

        // -------------------------------------------------------------------------------------

        StringBuilder sb04 = new StringBuilder();

        System.out.println(sb04.length()); // 0
        System.out.println(sb04.capacity()); // 16

        sb04.append("Java");
        System.out.println(sb04.length()); // 4
        System.out.println(sb04.capacity()); // 16

        sb04.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(sb04.length()); // 24 // 44
        System.out.println(sb04.capacity()); // 34 // 44, 32'yi astigi icin length kadar yer acti
    }
}
