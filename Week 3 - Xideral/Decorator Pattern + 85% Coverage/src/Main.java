package Decorator_Pattern_Code;

public class Main {

    public static void main(String[] args) {
        // Base beverage
        Beverage beverage = new Coffee();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Beverage with milk
        Beverage beverageWithMilk = new MilkDecorator(beverage);
        System.out.println(beverageWithMilk.getDescription() + " $" + beverageWithMilk.cost());

        // Beverage with milk and sugar
        Beverage beverageWithMilkAndSugar = new SugarDecorator(beverageWithMilk);
        System.out.println(beverageWithMilkAndSugar.getDescription() + " $" + beverageWithMilkAndSugar.cost());

        // Beverage with milk, sugar, and vanilla syrup
        Beverage fullyCustomizedBeverage = new SyrupDecorator(beverageWithMilkAndSugar, "Vanilla");
        System.out.println(fullyCustomizedBeverage.getDescription() + " $" + fullyCustomizedBeverage.cost());
    }
}

