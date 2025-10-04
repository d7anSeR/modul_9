package middle.four;

import java.util.ArrayList;
import java.util.List;

class Elevator {
    private static final int MAX_WEIGHT = 500;
    private int currentWeight = 0;
    private boolean isEnable = true;
    private List<Cargo> cargos = new ArrayList<>();

    void add(Cargo cargo) {
        if (currentWeight + cargo.getWeight() <= MAX_WEIGHT) {
            cargos.add(cargo);
            currentWeight += cargo.getWeight();
            System.out.println(cargo + " добавлен. Текущий вес: " + currentWeight + " кг");
        } else {
            isEnable = false;
            System.out.println("Перегруз! " + cargo + " не помещается. Общий вес: " + (currentWeight + cargo.getWeight()) + " кг");
        }
    }

    void push() {
        if (isEnable && currentWeight > 0) {
            System.out.println("Лифт поехал с весом: " + currentWeight + " кг");
        } else if (currentWeight == 0) {
            System.out.println("Лифт пустой, ехать не нужно.");
        } else {
            System.out.println("Лифт перегружен! Он не может ехать.");
        }
    }

    void pop() {
        if (cargos.isEmpty()) {
            System.out.println("Лифт пустой, нечего выгружать.");
        } else {
            System.out.println("Выгружаем: " + cargos);
            cargos.clear();
            currentWeight = 0;
            isEnable = true;
            System.out.println("Лифт пустой, готов к загрузке.");
        }
    }
}
