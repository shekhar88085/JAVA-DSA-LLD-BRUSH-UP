package LLD.DesignPatterns.Creational.Factory;

public class TransportFactory {
    public static Transport createTransport(Type type) {
        switch (type) {
            case CAR:
                return new Car();
            case BIKE:
                return new Bike();
            case TRUCK:
                return new Truck();
            default:
                throw new IllegalArgumentException("Invalid transport type");
        }
    }
}
