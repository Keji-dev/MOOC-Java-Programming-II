import java.text.MessageFormat;

public class Container {

    private int liquid;

    public Container() {
    }

    public int contains() {
        return liquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.liquid += amount;
        }

        if (this.liquid > 100) {
            this.liquid = 100;
        }
    }


    public void remove(int amount) {
        if (amount > 0) {
            this.liquid -= amount;
        }

        if (this.liquid < 0) {
            this.liquid = 0;
        }
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}/100", liquid);
    }

    public int getAmount() {
        return liquid;
    }

    public void setAmount(int amount) {
        this.liquid = amount;
    }
}