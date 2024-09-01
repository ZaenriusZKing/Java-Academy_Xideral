package Build_Pattern_Computer;

public class Main {

    public static void main(String[] args) {
        // Example of creating a computer with only processor and RAM
        Computer computer1 = new ComputerBuilder("Intel i7", "16GB")
                .build();

        // Example of creating a gaming computer with full specs
        Computer computer2 = new ComputerBuilder("AMD Ryzen 9", "32GB")
                .withGraphicsCard("NVIDIA RTX 3080")
                .withStorage("1TB SSD")
                .withPowerSupply("750W")
                .build();

        // Example of creating a computer with processor, RAM, and storage
        Computer computer3 = new ComputerBuilder("Intel i5", "8GB")
                .withStorage("512GB SSD")
                .build();

        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
    }
}
