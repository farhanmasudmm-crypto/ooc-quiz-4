public class VehiclePrinter {
    public void print(Vehicle vehicle) {
        System.out.println("Wheel count: " + vehicle.getWheelCount() + 
                           ", Max speed: " + vehicle.getMaxSpeed());
    }
}
