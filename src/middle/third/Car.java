package middle.third;

class Car {
    private String number;

    public Car(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car: " + "number='" + number + '\'';
    }
}