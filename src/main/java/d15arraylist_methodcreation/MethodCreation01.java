package d15arraylist_methodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {

        /*
        Java da Method Olusturma: Java'da bir metot (örneğin main metodu) içinde başka bir metot tanımlanamaz.
        Ancak bir metod içinde (mesela main), bir iç Class (nested class veya inner class) tanımlanabilir
        ve bu iç class'in içinde metotlar tanımlanabilir. Ancak LocalInnerClass yalnızca main metodu içinde
        geçerli ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz.


        Method Creation - Metot Olusturma
        Java'da method nasil olusturulur?

        1- main method'un disinda, class'in icinde olusturulur
        2- Syntax'i: Access Modifier + Return Type + Method ismi + () + {}
        3- Olusturulan method nasil kullanilir?
           Main icinden method cagrisi yapilmalidir. Buna Method Call denir.
        */
        double result = sum(10, 20);
        System.out.println(result); // 30.0
    } // main dışı

    // ornek 1: Toplama yapan bir method olusturunuz.
    // Example 1: Create a method that performs addition

    public static double sum(double num01, double num02) {
        return num01 + num02;
    }
}
