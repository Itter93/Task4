public class Train extends Vehicle implements Driveable {
    String name;
    String color;

    public Train() {
    }

    public Train(String color) {
        this.color = color;
    }

    public Train(String name, String color) {
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
        System.out.println("Поезд едет");
    }
}
