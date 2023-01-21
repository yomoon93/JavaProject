import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private double currentValue = 0.0;
    private double currentTotal = 0.0;
    private double memory = 0.0;
    private List<String> operations = new ArrayList<String>();

    private void addOperation(String op) {
        operations.add(op);
    }

    private void clearOperation() {
        operations.clear();
    }

    public String[] getOperation() {
        String[] res = new String[this.operations.size()];
        operations.toArray(res);
        return res;
    }

    public double getCurrentTotal() {
        this.clearOperation();
        return currentTotal;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void add() {
        currentTotal += currentValue;
        addOperation("+");
    }

    public void subtract() {
        currentTotal -= currentValue;
        addOperation("-");
    }

    public void modulus() {
        currentValue = currentValue % currentTotal;
        addOperation("/");
    }

    public void multiply() {
        currentTotal *= currentValue;
        addOperation("*");
    }

    public void divide() {
        currentTotal /= currentValue;
        addOperation("/");
    }

    public void clearTotal() {
        this.currentTotal = 0.0;
        this.clearOperation();
    }

    public void cancel() {
        this.currentValue = 0.0;
    }

    public void setMemory() {
        this.memory = this.currentTotal;
    }

    public void retrieveFromMemory() {
        this.currentValue = memory;
    }

    public void addToMemory() {
        this.currentTotal += memory;
    }

    public void subtractFromMemory() {
        this.currentTotal -= currentTotal;
    }

    public void clearMemory() {
        this.currentTotal = 0.0;
    }

    public void invert() {
        this.currentValue = -currentValue;
    }


    // a bit confusing
    public void printValue() {
        System.out.println("Value: " + this.currentValue);
    }

}