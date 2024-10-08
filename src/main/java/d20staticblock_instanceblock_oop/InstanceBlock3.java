package d20staticblock_instanceblock_oop;

public class InstanceBlock3 {

    // Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
    // Example 3: In a car factory, each car is black in colour and the fuel type is petrol.

    // (Bunlar ortak ozellikler. Digerleri sonra ayarlansin)

    public String color;

    public String fuelType;

    // -------------------------------------------------------------------------------------

    // Inctance block - Bu class'tan her object olusturulduğunda calisir.
    {
        color = "Siyah";
        fuelType = "Benzin";
    }

    // -------------------------------------------------------------------------------------

    // constructor - Class'in object'leri olusturuldugunda calisir

    public InstanceBlock3() {
        System.out.println("Araba rengi: " + color);
        System.out.println("Araba yakit turu: " + fuelType);
    }
    // Default olarak siyah ve bezinle baslatmak istemezsek parametreli constructor olusturunuz.

    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }
}
