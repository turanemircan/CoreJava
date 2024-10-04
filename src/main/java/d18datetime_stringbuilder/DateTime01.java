package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime01 {
    public static void main(String[] args) {

        /*
        LocalTime Class'ta kullanilan tarih saat formatlari

        HH : mm ==> 24'lu saat sistemi
        hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
        hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
        HH : mm : ss ==> saniyeyi gosterir
        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        "mm" "minute" demektir. "MM" "month" demektir.

        dd-MM-yyyy ==> gun - ay - yil
        MMM ==> Aug
        MMMM ==> August
        */

        // -------------------------------------------------------------------------------------

        // Ornek 1:“DateTimeFormatter”, bir Class’tir ve tarih ve saat verilerini belirli bir
        // biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.

        // DateTimeFormatter, tarih ve saat nesnelerini “metin” yani String olarak biçimlendirmenize ve
        // metni tarih ve saat nesnelerine çözmenize olanak tanır.

        // ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini
        // biçimlendirmek için kullanılır.

        // format() method’u LocalTime’i String’e istedigimiz formatta cevirir
        LocalTime myCurrentTime = LocalTime.now();

        DateTimeFormatter dtf01 = DateTimeFormatter.ofPattern("hh;mm a");

        String formattedTime = dtf01.format(myCurrentTime);
        System.out.println("formattedTime = " + formattedTime); // formattedTime = 11;15 ÖÖ

        // -------------------------------------------------------------------------------------

        // Ornek 2: Tarih’i formatlayalim

        LocalDate myCurrentDate = LocalDate.now();
        System.out.println("myCurrentDate = " + myCurrentDate); // myCurrentDate = 2024-10-04

        DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = dtf02.format(myCurrentDate);
        System.out.println("formattedDate = " + formattedDate); // 04-Ekim-2024

        // -------------------------------------------------------------------------------------

        // Ornek 3: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        // ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

        // -------------------------------------------------------------------------------------

        // Tokyo’da ayin kaci?
        LocalDate dataInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("dataInTokyo = " + dataInTokyo); // dataInTokyo = 2024-10-04 // Arastirma Odevi: Java bu bilgiyi internetten mi cekiyor?

        // -------------------------------------------------------------------------------------

        // Amsterdam’da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println("dateInAmsterdam = " + dateInAmsterdam); // dateInAmsterdam = 2024-10-04

        // -------------------------------------------------------------------------------------

        // Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeInTokyo = " + timeInTokyo); // timeInTokyo = 17:36:36.469623600

        // -------------------------------------------------------------------------------------

        /*
        // Tume zone'lari gorelim
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        for (String w : zoneIds) {
            System.out.println(w);
        }

        // Zaman dilimleri sayisini gorelim

        System.out.println("Toplam zaman dilimi sayisi : " + zoneIds.size());
        */

        // -------------------------------------------------------------------------------------

        // Ornek 4: Tarih ve zamani ayni anda kullanalim.
        // LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.

        LocalDateTime ldt01 = LocalDateTime.now();
        System.out.println(ldt01); // 2024-10-04T11:47:01.567729900

        DateTimeFormatter dtf03 = DateTimeFormatter.ofPattern("dd * MMMM * yyyy - hh : mm a");
        String formattedLdt = dtf03.format(ldt01);
        System.out.println(formattedLdt);
    }
}
