public class test {
public static void main(String[] args) {
// test
Car c = new Car(2, "Honda");
if (c.returnAge() == 2 && c.returnModel() == "Honda") System.out.println("All Tests past");
}
}

// inheritence
class Car {
public int age;
public String model;
public Car(int a, String m) {
age = a;
model = m;
}
public int returnAge() {
return age;
}
public String returnModel() {
return model;
}
}

