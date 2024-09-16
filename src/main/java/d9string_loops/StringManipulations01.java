package d9string_loops;

public class StringManipulations01 {
    public static void main(String[] args) {

        // Ornek 1: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        // Example 1: Starting from a specific character of a String up to a specific character
        // take all characters as dynamic.

        // 1. yol: Hard Coding, tavsiye edilmez

        String mail = "abc@gmail.com";
        System.out.println(mail.substring(4, 9)); // gmail

        // 2. Yol: Dinamik

        String company01 = mail.split("@")[1].split("\\.")[0]; // \\. yazarak kesinlikle noktadan kesmesini belirtiyoruz
        System.out.println(company01); // gmail

        // 3.Yol

        // indexOf() method’u spesifik bir karakterin ilk gorunumunun index’ini verir
        // Bu method olmayan karakterler icin -1 verir

        int startingIndex = mail.indexOf("@") + 1; // 4
        int endingIndex = mail.indexOf("."); // 9

        String companyName = mail.substring(startingIndex, endingIndex);
        System.out.println(companyName);
    }
}
