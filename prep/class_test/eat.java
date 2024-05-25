package prep.class_test;
public class eat {
    public static void main(String args[]) throws InterruptedException {
    Animal dogAnimal = new Animal(100);
    dogAnimal.eat();
    for (int i = 0;i<100;i++) {
        dogAnimal.eat();
        dogAnimal.exercise();
        dogAnimal.eat();
        Thread.sleep(500);
    }
}
}
