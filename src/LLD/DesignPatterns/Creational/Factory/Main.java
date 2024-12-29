package LLD.DesignPatterns.Creational.Factory;

public class Main {
    public static void main(String[] args) {
        Transport car = TransportFactory.createTransport(Type.CAR);
        car.deliver();

        Transport bike = TransportFactory.createTransport(Type.BIKE);
        bike.deliver();

        Transport truck = TransportFactory.createTransport(Type.TRUCK);
        truck.deliver();
    }
}
