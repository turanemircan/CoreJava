package d20staticblock_instanceblock_oop;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog dog01 = new Dog();
        dog01.bark(); // Dogs bark...
        dog01.feedWithMilk(); // Mammals feed their babies with milk...
        dog01.drink(); // Animals drink...

        Bird bird01 = new Bird();
        bird01.tweet(); // Birds tweet...
        bird01.eat(); // Animals eat...
        bird01.drink(); // Animals drink...
    }
}