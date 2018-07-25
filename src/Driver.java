public class Driver extends Person {

    private String driverLicense;

    public String drive() {
        return "The car is driven by: " + driverLicense;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

}
