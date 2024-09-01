package Build_Pattern_Computer;

public class ComputerBuilder {
    private final String processor; // required
    private final String ram;       // required
    private String graphicsCard;    // optional
    private String storage;         // optional
    private String powerSupply;     // optional

    public ComputerBuilder(String processor, String ram) {
        this.processor = processor;
        this.ram = ram;
    }

    // Setters
    public ComputerBuilder withGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public ComputerBuilder withStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder withPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }

    // Getters
    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getStorage() {
        return storage;
    }

    public String getPowerSupply() {
        return powerSupply;
    }
}

