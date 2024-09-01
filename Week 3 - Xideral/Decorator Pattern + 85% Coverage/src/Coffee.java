package Decorator_Pattern_Code;

public class Coffee implements Beverage {
    
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 2.00; // base price for coffee
    }
}

