package d6if_switch;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        /*
        kullanıcıdan iki sayı isteyin
        sayıların ikisi de pozitifse sayıların toplamını yazdırın
        ikisi de negatifse sayıların çarpımını yazdırın
        ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Iki Sayı Giriniz : ");

        double num01 = input.nextDouble();
        double num02 = input.nextDouble();

        if (num01 > 0 && num02 > 0) {
            System.out.println("Toplamları = " + (num01 + num02));
        } else if (num01 < 0 && num02 < 0) {
            System.out.println("Çarpımları = " + (num01 * num02));
        } else if (num01 > 0 && num02 < 0 || num01 < 0 && num02 > 0) {
            System.out.println("Farklı işaretlerde sayılarla işlem yapamazsın");
        } else System.out.println("Sıfır çarpmaya göre yutan elamandır");
    }
}
