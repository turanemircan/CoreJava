package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodCreation02 {
    public static void main(String[] args) {

        double result01 = multiply(15, 20);
        System.out.println("result01 = " + result01);

        double result02 = firstTwoMultiplyThirdAdd(4, 4, 2);
        System.out.println("result02 = " + result02);

        print("Emircan");
    } // Main dışı

    // ornek 1: Iki sayiyi carpan bir method olusturunuz.
    // example 1: Create a method that multiplies two numbers

    protected static double multiply(double num01, double num02) {
        // protected: Bu class’tan erisilebilir.
        // Bir de sadece miras alinan class’lardan erisilebilir(extends)
        return num01 * num02;
    }

    // ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz.
    // example 2: Create a method that multiplies the first two of the given 3 numbers and adds the result with the third number.

    // private : Buraya sadece ayni class icerisinden erisilebilir.Diger class’lar erisemez

    private static double firstTwoMultiplyThirdAdd(double num01, double num02, double num03) {
        return num01 * num02 + num03;
    }

    // -------------------------------------------------------------------------------------

    // ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
    // example 3: Create a method that prints an entered word to the console

    // Eger bir method yeni bir data uretmiyor ise return type’i void olur.void ise return yazilmaz

    public static void print(String str) {
        System.out.println(str);
    }
}
