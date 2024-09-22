package d6if_switch;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan sisteme bir numara girmesini isteyin.

        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Pozitif Rakam" yazdırın,
        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Bir numara giriniz : ");

        int num01 = input.nextInt();

        if (num01 < 0) {
            System.out.println("Negatif Sayı");
        } else {
            if (num01 < 10) {
                System.out.println("Pozitif Rakam");
            } else {
                System.out.println("Pozitif Sayı");
            }
        }
    }
}
