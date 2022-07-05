package exam3;

public class Client {


    public static void main(String[] args) {
        Parts car = PartsFactory.getParts(new CarFactory("벤츠", 3000000, "3M", 100000));
        Parts ship = PartsFactory.getParts(new ShipFactory("현대", 70000000, "3M", 5000000));
        System.out.println(car.toString());
        System.out.println(ship.toString());

    }
}
