package prep;

public class constructors {
    public static void main(String[] args) {
        Bikes john = new Bikes("Blue", 56);
        Bikes bill = new Bikes();
        bill.printInfo();
        john.printInfo();
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
    } public void printInfo() {
        System.out.print("Bike Color = " + bikeColor);
        System.out.println("\nBike Max Speed = " + bikeSpeed);
    }
}