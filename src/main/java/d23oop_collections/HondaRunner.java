package d23oop_collections;

public class HondaRunner {
    public static void main(String[] args) {

        // Honda h = new Honda(); Abstract class'lardan object uretilemez cunku su-ınıflandırma icin uretildi.

        Civic civic01 = new Civic();
        civic01.engine(); // Gas 1.6 Eco

        Accord accord01 = new Accord();
        accord01.engine(); // Gas 2.0 Turbo

        accord01.music(); // Pro
    }
}
