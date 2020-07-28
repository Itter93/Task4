public class Boat extends Vehicle implements Swimable {
    String name;
    String color;

    public Boat() {
    }

    public Boat(String color) {
        this.color = color;
    }

    public Boat(String name, String color) {
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
    public void swim() {
        System.out.println("Лодка плавает");
    }
}
