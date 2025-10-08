package middle.four;

class Cargo {
    private int weight;

    public Cargo(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cargo: " + "weight=" + weight + " кг";
    }
}
