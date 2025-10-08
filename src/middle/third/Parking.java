package middle.third;

import java.util.ArrayList;
import java.util.List;


class Parking {
    private int capacity;
    private List<Car> cars;

    public Parking(int capacity) {
        this.capacity = capacity;
        this.cars = new ArrayList<>();
    }

    public boolean push(Car car) {
        if (cars.size() < capacity) {
            cars.add(car);
            System.out.println(car + " заехала на парковку. Занято мест: " + cars.size());
            return true;
        } else {
            System.out.println("Нет мест! Машина " + car + " не может заехать.");
            return false;
        }
    }

    public Car pop() {
        if (!cars.isEmpty()) {
            Car car = cars.remove(cars.size() - 1);
            System.out.println(car + " уехала с парковки. Занято мест: " + cars.size());
            return car;
        } else {
            System.out.println("Парковка пустая!");
            return null;
        }
    }

    public void showParking() {
        System.out.println("Сейчас на парковке: " + cars);
    }
}
