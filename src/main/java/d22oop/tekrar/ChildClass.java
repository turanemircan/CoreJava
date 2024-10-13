package d22oop.tekrar;

public class ChildClass extends ParentClass {
    @Override
    public Integer multiply(Integer num01, Integer num02) {
        // Parent class'in multiply methodunu cagirdik.
        Integer sonuc = super.multiply(num01, num02); // 20

        // Ek islevsellik katalim
        return sonuc + 10; // 20 + 10 = 30
        // Parent method degismez.
    }
}
