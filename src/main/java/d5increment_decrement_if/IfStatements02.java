package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        // Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

        // Example 1: Create the code that prints whether a number received from the user is odd or even.

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");

        int num01 = input.nextInt();

        // 1.yol:

        if (num01 % 2 == 0) {
            System.out.println("Cift sayi");
        }

        if (num01 % 2 != 0) { // num01 % 2 == 1; de yazabilirdik
            System.out.println("Tek sayi");
        }

        // 2.yol:
        // if - else Statements

        if (num01 % 2 == 0) {
            System.out.println("Sayi cifttir");
        } else {
            System.out.println("Sayi tektir");
        }

        // -------------------------------------------------------------------------------------

        if (-1 < num01) {
            if (num01 % 2 == 0) {
                System.out.println("Girdiginiz sayi Cifttir.");
            } else {
                System.out.println("Girdiginiz sayi Tektir.");
            }
        } else {
            System.out.println("Girdiginiz sayı Dogal sayi degildir.\nTeklik-Çiftlik aranması için Dogal sayı olması gerekmektedir!");
        }
    }
}
