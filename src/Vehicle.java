// This is the parent car
public class Vehicle {

    private int speed;

    public Vehicle() {
        System.out.println("A new vehicle is created...");
    }

    public String start() {
        return "The vehicle is starting...";
    }

    public String accelerate() {
        return "The vehicle is accelerating at " + speed + " mph...";
    }

    public String stop() {
        return "The vehicle is stopping...";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
