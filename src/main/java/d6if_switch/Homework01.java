package d6if_switch;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {

        /*
        -Homework-

        1) Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
        uygun mesaj veren kodu yaziniz

        2) Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
        Pazar ==> 1. gun , Pazartes ==> 2. gun...

        3) Ay sayisini verdiginizde ay ismini veren kodu yaziniz
        1==>January , 2==> February
        */

        // 1) Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
        // uygun mesaj veren kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Password : ");

        String pwd = input.nextLine();

        if (pwd.equals("pwd123!")) {
            System.out.println("Password Dogru. Giris Basarılı!");
        } else System.out.println("Password Yanlıs. Giris Başarısız. Lütfen Tekrar Deneyin.");
    }
}
