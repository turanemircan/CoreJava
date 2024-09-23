package d11loops;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {

        /*
        Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        Homework: Draw the following figure using for-loop.

            *
            * *
            * * *
            * * * *
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Satir sayisini giriniz : ");
        int row01 = input.nextInt();

        for (int i = 1; i <= row01; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
