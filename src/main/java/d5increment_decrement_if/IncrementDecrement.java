package d5increment_decrement_if;

public class IncrementDecrement {
    public static void main(String[] args) {

        // --------------- Increment ---------------

        int a = 5;
        a = a + 2; // a iki defa yazilmiş. Tekrardan kurtulabiliriz.
        System.out.println("a = " + a); // a = 7
        a += 2; // a = a + 2; nin aynisidir
        System.out.println("a = " + a); // a = 9

        // --------------- Decrement ---------------

        int b = 10;
        b = b - 3; // b iki defa yazilmiş. Tekrardan kurtulabiliriz.
        System.out.println("b = " + b); // b = 7
        b -= 4; // b = b - 4; nin aynisidir
        System.out.println("b = " + b); // b = 3

        // --------------- Carpma ---------------

        int c = 6;
        c = c * 2; // c iki defa yazilmiş. Tekrardan kurtulabiliriz.
        System.out.println("c = " + c); // c = 12
        c *= 2; // c = c * 2; nin aynisidir
        System.out.println("c = " + c); // c = 24

        // --------------- Bolme ---------------

        int d = 24;
        d = d / 2; // d iki defa yazilmiş. Tekrardan kurtulabiliriz.
        System.out.println("d = " + d); // d = 12
        d /= 2; // d = d / 2; nin aynisidir
        System.out.println("d = " + d); // d = 6

        // --------------- 1 ile increment ---------------

        int e = 13;
        e = e + 1;
        e += 1;
        e++;
        System.out.println("e = " + e); // e = 16

        // --------------- -1 ile increment ---------------

        int f = 15;
        f = f - 1;
        f -= 1;
        f--;
        System.out.println("f = " + f); // f = 12

        // --------------- 1 ile increment ---------------

        int g = 13;
        g = g + 1;
        g += 1;
        g++;
        System.out.println("g = " + g); // g = 16

        // --------------- Post Increment (i++). Pre Increment (++i) ---------------

        int i = 10;
        int k = i++;

        System.out.println("k = " + k); // k = 10
        System.out.println("i = " + i); // i = 11

        // -------------------------------------------------------------------------

        int m = 15;
        int n = ++m;

        System.out.println("n = " + n); // n = 16
        System.out.println("m = " + m); // m = 16

        // -------------------------------------------------------------------------

        int p = 17;
        int r = p--;

        System.out.println("r = " + r); // r = 17
        System.out.println("p = " + p); // p = 16

        // -------------------------------------------------------------------------

        int s = 20;
        int t = --s;

        System.out.println("t = " + t); // t = 19
        System.out.println("s = " + s); // s = 19
    }
}
