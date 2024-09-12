package d7ternary_string;

public class Ternary02 {
    public static void main(String[] args) {

        // Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.
        // Example : Write the code to check if the given number has 3 digits

        int num01 = -123;
        num01 = Math.abs(num01);

        String result01 = (num01 > 99 && num01 < 1000) ? "Uc basamaklidir." : "Uc basamakli degildir.";
        System.out.println("Sonuc01 : " + result01);
    }
}
