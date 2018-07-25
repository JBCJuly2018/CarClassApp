public class CarApp {

    public static void main(String[] args) {

        // Created a new Vehicle object instance
        Vehicle firstVehicle = new Vehicle();

        // These are the Vehicle class's methods (parent)
        output(firstVehicle.start());

        firstVehicle.setSpeed(55);
        output(firstVehicle.accelerate());

        output(firstVehicle.stop());

        output("================================================");

        // Created a new Car object instance
        Car firstCar = new Car();

        // Set parameters to the Car
        firstCar.setMake("Toyota");
        firstCar.setModel("Corolla");
        firstCar.setYear(2018);

        output(firstCar.toString());

        // Use the parent's methods:
        output(firstCar.start());

        // Set speed came from the parent class
        firstCar.setSpeed(75);
        output(firstCar.accelerate());

        output(firstCar.stop());

        output("================================================");

        // Create a new Person object instance
        Person firstPerson = new Person();

        output(firstPerson.getDriverLicense());
    }

    public static void output(String message) {
        System.out.println(message);
    }

}
