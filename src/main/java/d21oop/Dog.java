package d21oop;

public class Dog extends Mammal {

    public void bark() {
        System.out.println("Dogs bark...");
    }

    @Override // Anotation
    public void eat() {
        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create() {
        return new Dog(); // Upcasting => Child Parent'inin Data Type'ni kullanabilir. (Java Otomatik yapar)
        // downcasting => Java otomatik yapmaz.
    }

    @Override
    public int add(int num01, int num02) {
        // Primitive'ler arasinda parent-child ilişkisi yoktur.
        // Yani primitive'lerde return type degiştirilemez.
        return num01 + num02;
    }
}