package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {

        /*
        Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz

            1==> Pazar, 2 ==> Pazartesi

        Example 1: When you receive the number of days from the user, write the code that writes the day name

            1==> Sunday, 2 ==> Monday
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen kacinci gun oldugunu giriniz : ");
        double num01Double = input.nextDouble();
        int num01 = (int) num01Double; // typecasting büyük türden küçük türe çevirdik.

        if (num01Double != num01) {
            System.out.print("Lütfen Bir Tamsayi giriniz");
        } else {
            if (num01 <= 0) { // num01 < 1; de yazabilirdim
                System.out.println("Gun sayilari 1'den kucuk olamaz.");
            } else if (num01 == 1) {
                System.out.println("Pazar");
            } else if (num01 == 2) {
                System.out.println("Pazartesi");
            } else if (num01 == 3) {
                System.out.println("Sali");
            } else if (num01 == 4) {
                System.out.println("Carsamba");
            } else if (num01 == 5) {
                System.out.println("Persembe");
            } else if (num01 == 6) {
                System.out.println("Cuma");
            } else if (num01 == 7) {
                System.out.println("Cumartesi");
            } else {
                System.out.println("Gun sayilari 7'den buyuk olamaz.");
            }
        }
    }
}
