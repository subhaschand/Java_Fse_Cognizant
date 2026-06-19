package week1.factory;


interface Vehicle {
    void start();
}

// Concrete Product - Car
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car Started");
    }
}

// Concrete Product - Bike
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike Started");
    }
}

// Concrete Product - Truck
class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck Started");
    }
}

// Factory Class
class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "car":
                return new Car();

            case "bike":
                return new Bike();

            case "truck":
                return new Truck();

            default:
                throw new IllegalArgumentException("Invalid Vehicle Type");
        }
    }
}
public class Main {

    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.getVehicle("car");
        Vehicle v2 = VehicleFactory.getVehicle("bike");
        Vehicle v3 = VehicleFactory.getVehicle("truck");

        v1.start();
        v2.start();
        v3.start();
    }
}
