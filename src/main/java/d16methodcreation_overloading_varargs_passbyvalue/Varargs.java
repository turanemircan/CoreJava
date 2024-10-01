package d16methodcreation_overloading_varargs_passbyvalue;

public class Varargs {
    public static void main(String[] args) {

        /*
        Varargs, bir methodun değişken sayıda argüman almasına izin veren bir özelliktir.
        Varargs, "variable arguments" yani "değişken sayıda argüman"ın kısaltmasıdır.

        Varargs, aşağıdaki kurallara tabidir:

        1- Birden fazla varargs kullanilamaz. Varargs parametre, her zaman son parametre olmalıdır.
        Yoksa veri tabani surekli veri kabul eder ve diger parametreye gecemez.
        2- Varargs arka planda Array yapisini kullanir
        3- Varargs parametre, bir primitive veri tipi veya non-primitive(referans) olabilir.
        4- Varargs parametre, aynı türdeki birden fazla argüman alabilir.
        5- Varargs parametre, sıfır argüman alabilir. main ici add(); olabilir
        */

        // Variable arguments - Değişken sayida argümanlar
        int result01 = add(3, 7, 10);
        System.out.println(result01);
    } // Main dışı

    /*
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    */

    public static int add(int b, int... a) { // 3 nokta koydugunuzda Java bunu varargs kabul eder. Yani istedigin kadar argüman girebilirsin.
        // Burdaki int b usused code durumuna düştü. Kullanılmayan code hata verir. // varargs hiç parametre girilmesede kabul eder
        int sum = 0;
        for (int w : a) {
            sum += w;
        }
        return sum;
    }
}
