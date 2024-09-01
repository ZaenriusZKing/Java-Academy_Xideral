package Decorator_Pattern_Code;

public class SyrupDecorator extends BeverageDecorator {

    private final String flavor;

    public SyrupDecorator(Beverage beverage, String flavor) {
        super(beverage);
        this.flavor = flavor;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + flavor + " Syrup";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.75; // additional cost for syrup
    }
}

