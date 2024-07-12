public class Container {

    private int first;
    private int second;

    public Container() {
        this.first = first;
        this.second = second;
    }

    public int contains() {
        return first + second;
    }

    public void add(int amount) {
        if (amount > 0) {
            first += amount;
            if (first >= 100 || amount >= 100) {
                first = 100;
            }
        }
    }

    public void move(int amount) {
        if (amount > 0) {
            if (amount <= first) {
                first -= amount;
                second += amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (amount <= second) {
                second -= amount;
            }
        }
    }

    @Override
    public String toString() {
        return getFirst() + "/100\n" + getSecond() + "/100\n";
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
