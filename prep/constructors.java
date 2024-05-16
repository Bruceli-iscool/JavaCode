package prep;

public class constructors {
    public static void main(String[] args) {
        Bikes john = new Bikes("Blue", 56);
        Bikes bill = new Bikes();
        bill.printInfo();
        john.printInfo();
        MotorCycle steven = new MotorCycle("Honda",100, "Orange", 100);
        steven.printInfo();
        MotorCycle tim = new MotorCycle();
        tim.printInfo();
    }
}

class Bikes {
    String bikeColor;
    int bikeSpeed;
    public Bikes() {
        // default 
        bikeColor = "Red";
        bikeSpeed = 23;
    }
    public Bikes(String color, int maxspeed) {
        bikeColor = color;
        bikeSpeed = maxspeed;
    } 
    public void printInfo() {
        System.out.print("Bike Color = " + bikeColor);
        System.out.println("\nBike Max Speed = " + bikeSpeed);
    }
}
class MotorCycle extends Bikes {
    String motorBrand;
    int loud;
    public MotorCycle() {
        super.bikeSpeed = 300;
        super.bikeColor = "Purple";
        motorBrand = "Toyota";
        loud = 1_000_000;
    }
    public MotorCycle(String brand, int loudness, String color, int speed) {
        super.bikeSpeed = speed;
        super.bikeColor = color;
        motorBrand = brand;
        loud = loudness;
    }
    public void printInfo() {
        System.out.println("Motorcycle brand = " + motorBrand);
        System.out.println("Motorcycle loudness = " + loud);
        System.out.println("Motorcycle color = " + super.bikeColor);
        System.out.println("Motorcycle speed = " + super.bikeSpeed);
    }
}