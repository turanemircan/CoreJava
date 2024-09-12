package d7ternary_string;

public class Ternary01 {
    public static void main(String[] args) {

        // Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.

        // Example 1: Write the code that calculates the absolute value of a number.

        // -4 ==> -1*-4, 4 ==> 4, 0 ==> 0

        // Bir gerçek sayının sayı doğrusundaki yerinin başlangıç noktasına (sıfıra) olan uzaklığına
        // o sayının mutlak değeri denir. Sifirin mutlak degeri de sifirdir.

        int num01 = -14;

        //         (condition) ? (true)     : (false);
        int result01 = num01 < 0 ? num01 * -1 : num01;
        System.out.println("Sonuc01 : " + result01);

        // -------------------------------------------------------------------------------------

        // Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // “Farkli isaretli sayilari carpamiyorum” mesaji veren kodu yaziniz.

        // Example 2: If the signs of two numbers are the same, multiply these numbers, if the signs are different
        // Write the code that gives the message “I cannot multiply numbers with different signs”.

        int num02 = 7;
        int num03 = -4;

        Object result02 = (num02 < 0 && num03 > 0) || (num02 < 0 && num03 < 0) ? (num02 * num03) : ("Farkli işsaretli sayilari carpamiyorum");
        System.out.println("Sonuc02 : " + result02);
    }
}
