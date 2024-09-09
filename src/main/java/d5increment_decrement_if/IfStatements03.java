package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        // if -- else if -- else Statements

        /*
        if () {
            
        } else if () {
            
        } else if () {

        } else {

        }
        */

        // Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz.

        // Example 1: Write the code that checks whether a number received from the user is positive, negative or neutral

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Tamsayi giriniz : ");
        int num01 = input.nextInt();

        if (num01 > 0) {
            System.out.println(num01 + " sayisi pozitiftir.");
        } else if (num01 < 0) {
            System.out.println(num01 + " sayisi negatiftir.");
        } else {
            System.out.println(num01 + " sayisi nötrdür.");
        }
    }
}
