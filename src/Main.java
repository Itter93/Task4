import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Bike bike = new Bike("Happy", "Black");
        Car car = new Car("White");
        Train train = new Train();
        Boat boat = new Boat("Boat", "Gold");

        System.out.println("Bike's name: " + bike.getName() + ", Bike's color: " + bike.getColor());
        System.out.println("Car's color:" + car.getColor());
        System.out.println("Boat's name: " + boat.getName() + ", Boat's color: " + boat.getColor() + "\n");

        plane.weight();
        System.out.println();

        car.drive();
        bike.ride();
        train.drive();
        plane.drive();
        plane.fly();
    }
}
