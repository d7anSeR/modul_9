package middle.third;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking(20);

        for (int i = 1; i <= 22; i++) {
            Car car = new Car("A" + i + "BC-77");
            parking.push(car);
        }

        parking.showParking();

        parking.pop();
        parking.pop();

        Car newCar = new Car("NEW-001");
        parking.push(newCar);

        parking.showParking();
    }
}
