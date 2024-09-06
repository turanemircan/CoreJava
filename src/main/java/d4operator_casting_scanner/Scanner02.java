package d4operator_casting_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        /*
        Ornek 1:
        Kullanıcıdan;
        i)Adini ve Soyadini
        ii)Yaşını
        iii)Boyunu
        iv)Kilosunu
        v)Medeni durumunu girmesini isteyin.

        Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın

        Example 1:
        From the user;
        i) Name and Surname ii) Age
        iii)Height
        iv) Weight
        v) Ask him to enter his marital status.

        Then print them on separate lines in the console with a label
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen adınızı ve soyadınızı giriniz : ");
        String fullName = input.nextLine();

        System.out.print("Lütfen yasinizi giriniz : ");
        byte age = input.nextByte();

        System.out.print("Lütfen boyunuzu giriniz : ");
        float height = input.nextFloat();

        System.out.print("Lütfen kilonuzu giriniz : ");
        short weight = input.nextShort();

        System.out.print("Lütfen medeni durumunuzu giriniz : ");
        String maritalStatus = input.next();

        System.out.println("Adınız Soyadınız : " + fullName +
                "\nYasiniz : " + age +
                "\nBoyunuz : " + height +
                "\nKilonuz : " + weight +
                "\nMedeni durum : " + maritalStatus);
    }
}
