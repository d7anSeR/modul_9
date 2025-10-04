package middle.four;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        elevator.add(new Cargo(200));
        elevator.add(new Cargo(150));
        elevator.add(new Cargo(120));
        elevator.add(new Cargo(100)); // перегруз

        elevator.push();

        elevator.pop();

        elevator.add(new Cargo(300));
        elevator.add(new Cargo(180));

        elevator.push(); // снова перегруз
        elevator.pop();
    }
}
