package prep.class_test;


public class Animal {
    int hunger;
    public Animal(int h) {
        hunger = h;
    } public void eat() {
        hunger += 5;
    } public void exercise() {
        if (hunger > 0) {
            hunger -= 10;
        } else {
            System.out.println("Your animal is dead.");
        }
    }
}
