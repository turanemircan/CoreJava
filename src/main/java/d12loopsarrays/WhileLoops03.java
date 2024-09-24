package d12loopsarrays;

public class WhileLoops03 {
    public static void main(String[] args) {

        // Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        // Example 1: Write the code to check if a given integer is a palindrome.
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int num01 = 121;
        String original = String.valueOf(num01); // "121"
        String reversed = ""; // Ters çevirilmiş olani bunnun icinde saklayacağiz.

        int index = original.length() - 1; // Son index'i aldık

        while (index >= 0) {
            reversed += original.charAt(index);
            index--;
        }
        if (original.equals(reversed)) {
            System.out.println("Palindrome sayi'dir.");
        } else System.out.println("Palindrome sayi değildir.");
    }
}
