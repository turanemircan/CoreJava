package d10loops;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        /*
              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                    X X X X X
                    X X X X X
                    X X X X X
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Satir (Row) sayisini giriniz : ");

        int row = input.nextInt();

        System.out.print("Sutun (Column) sayisini giriniz : ");

        int column = input.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
