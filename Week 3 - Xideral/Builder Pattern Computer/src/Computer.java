package Build_Pattern_Computer;

public class Computer {
    private final String processor; // required
    private final String ram;       // required
    private final String graphicsCard; // optional
    private final String storage;      // optional
    private final String powerSupply;  // optional

    // Constructor
    Computer(ComputerBuilder builder) {
        this.processor = builder.getProcessor();
        this.ram = builder.getRam();
        this.graphicsCard = builder.getGraphicsCard();
        this.storage = builder.getStorage();
        this.powerSupply = builder.getPowerSupply();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", storage='" + storage + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                '}';
    }
}

