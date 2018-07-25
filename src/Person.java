public class Person {

    private String name;

    private Driver driver;

    public Person() {
        this.driver = new Driver();
        driver.setDriverLicense("Bob-00000000");
    }

    public String getDriverLicense() {
        return driver.getDriverLicense();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
