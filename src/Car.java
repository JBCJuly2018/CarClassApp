public class Car extends Vehicle {

    private String make;
    private String model;
    private int year;

    // could have driver name, license number, gender
    // makes it less about the car... because there's more about the driver

    // put the driver in the car
    private Driver driver;

    public Car() {
        super();
        // Create a new driver object instance every time a new car object instance is created...
        this.driver = new Driver();
        // Set the name of the driver
        driver.setName("Bob");
        System.out.println("A new car has been created...");
    }

    public String getDriverName() {
        return driver.getName();
    }

    @Override
    public String start() {
        return "The car is starting...";
    }

    @Override
    public String accelerate() {
        return "The car is accelerating at " + super.getSpeed() + " mph ...";
    }

    @Override
    public String stop() {
        return "The car is stopping...";
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
