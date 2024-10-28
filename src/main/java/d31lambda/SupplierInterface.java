package d31lambda;

import java.util.Map;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        // Ornek: Rastgele sayi ureten bir method olusturunuz.
        // Example: Create a method that generates random numbers.

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());

        Supplier<Integer> contantNumber = () -> 42;
        System.out.println(contantNumber.get());
    }
}
