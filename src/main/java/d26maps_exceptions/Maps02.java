package d26maps_exceptions;

import java.util.HashMap;
import java.util.Map;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Emir", 23);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet", 41);

        stdAges.put("Veli", 65);
        System.out.println(stdAges); // {Emir=23, Can=19, Ahmet=41, Veli=65, Ali=18}

        // 1) replace() methodu, value'lari key'leri kullanarak update etmeye yarar
        // Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stdAges.replace("Veli", 59);
        System.out.println(stdAges); // {Emir=23, Can=19, Ahmet=41, Veli=59, Ali=18}

        // 2) replace() methodu, eski deger kontrolu yaparakta calisir
        stdAges.replace("Veli", 21, 45);
        System.out.println(stdAges); // Degisiklik olacak cunku eski deger 21 degil. {Emir=23, Can=19, Ahmet=41, Veli=59, Ali=18}

        stdAges.replace("Veli", 59, 45);
        System.out.println(stdAges); // Degisiklik olacak cunku eski deger 59. {Emir=23, Can=19, Ahmet=41, Veli=59, Ali=18}

        // 3) putIfAbsent() metodu, belirtilen key ve value çiftini, key Map’te yoksa Map’e ekler.
        // Key Map’te zaten varsa, metodun hiçbir etkisi olmaz.
        // Ornek kullanım mail hesabı olustururken bu e-posta daha once kullanilmis uyarisi bundan dolayi cikar.

        stdAges.putIfAbsent("Veli", 77);
        System.out.println(stdAges); // {Emir=23, Can=19, Ahmet=41, Veli=45, Ali=18}
        // Tom key'i map'te oldugu icin "Tom", 77'yi eklemedi.

        stdAges.putIfAbsent("Ayse", 23);
        System.out.println(stdAges); // {Emir=23, Can=19, Ahmet=41, Veli=45, Ayse=23, Ali=18} HashMap açtığımız için rastgele sıralıyor
        // Ayse key'i map'te olmadigi icin "Ayse", 23'u ekledi.

        // -------------------------------------------------------------------------------------

        // 4- get() ve getOrDefault() method’lari eger aranan eleman map’te var ise, ikisi de ayni isi yapar
        // key verirsiniz, size value verir. Ancak getOrDefault() metodu, anahtar bulunamadığında
        // bir varsayılan değer sağlama avantajına sahiptir.

        System.out.println(stdAges.get("Veli")); // 45
        System.out.println(stdAges.getOrDefault("Veli", 18)); // 45, Veli map'te var
        // Veli'nin orjinal degerini verdi.

        System.out.println(stdAges.get("Serkan")); // null
        System.out.println(stdAges.getOrDefault("Serkan", 0)); // 18 todo: Tekrar İzle!!!!

        // -------------------------------------------------------------------------------------

        // 5)containsKey() metodu, Map’te bir key olup olmadığını kontrol eder.
        // containsValue() metodu ise, Map’te bir value olup olmadığını kontrol eder.
        // Boolean return ederler

        Boolean b = stdAges.containsValue(19);
        System.out.println(b); // true

        System.out.println(stdAges.containsKey("VELİ")); // false, buyuk kucuk harf duyarli
        System.out.println(stdAges.containsKey("Veli")); // true

        // ----------------------Buyuk kucuk harfe duyarsiz yapma

        Map<String, Integer> stdAges02 = new HashMap<>();
        stdAges02.put("Veli".toLowerCase(), 25);

        System.out.println(stdAges02); // {veli=25}

        boolean b01 = stdAges02.containsKey("VELİ");
        System.out.println(b01); // true

        // -------------------------------------------------------------------------------------

        String emoji = "\uD83D\uDE0A";
        System.out.println("Emoji = " + emoji);

        // -------------------------------------------------------------------------------------

        String emoji02 = "❤\uFE0F";
        System.out.println("Emoji = " + emoji02);
    }
}
