package middle.four;

class Cargo {
    private int weight;

    Cargo(int weight) {
        this.weight = weight;
    }

    int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cargo: " + "weight=" + weight + " кг";
    }
}
