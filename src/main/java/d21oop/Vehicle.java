package d21oop;

import java.lang.reflect.Type;

public class Vehicle {

    /*
    Constructor Hiyerarsisi- Child class'tan bir object olusturdugunuzda constructor'lar
    en ustteki parent class'tan baslatilarak alta doğru calistirilir
    */

    // Constructor olusturalim

    public Vehicle() {
        // super(); // Her zaman en başta olmalı
        this("Honda", 2024, "Elektrikli");
        System.out.println("Honda, 2023, Benzin");
    }

    public Vehicle(String brand, int year, String fuelType) { // 4
        super();
        System.out.println("Honda, 2024, Elektrikli");
    }
}