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
        MotorCycle[] motors = {steven, tim};
        tim.printInfo();
        Boolean[] sellable = {tim.sell(), steven.sell()};
        for (byte i = 0; i < sellable.length; i++) {
            System.out.println(sellable[i]);
        } 
        for (MotorCycle z:motors) {
            System.out.println(z);
        }
    }
}

class Bikes {
    // bikes
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
    public boolean sell() {
        if (loud > 100 || super.bikeSpeed < 100) {
            return false;
        } else {
            return true;
        }
    }
}
