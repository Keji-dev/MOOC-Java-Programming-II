
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
        history.add(initialBalance);
        setBalance(initialBalance);
    }

    
    public String history() {
        return history.toString();
    }
    
  @Override
    public void addToWarehouse(double amount) {
        if(amount < 0) {
            return;
        }
        super.addToWarehouse(amount);
        double newBalance = super.getBalance();
        history.add(newBalance);
        
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        double newBalance = super.getBalance();
        history.add(newBalance);
        return amountTaken;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history.toString());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
    
}
