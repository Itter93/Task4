public class Plane extends Vehicle implements Flyable, Driveable {
    String name;
    String color;

    public Plane() {
    }

    public Plane(String color) {
        this.color = color;
    }

    public Plane(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void drive() {
        System.out.println("Самолет едет");
    }

    @Override
    public void fly() {
        System.out.println("Самолет летает");
    }

    public void weight() {
        System.out.println("Масса как у Plane");
    }
}
