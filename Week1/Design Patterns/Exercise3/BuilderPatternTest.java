public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a basic Computer configuration
        Computer basicComputer = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .build();
        System.out.println("Basic Computer: " + basicComputer);

        // Create a high-end Computer configuration
        Computer gamingComputer = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("16GB")
            .setStorage("1TB SSD")
            .setGraphicsCard("NVIDIA RTX 3080")
            .setWiFi(true)
            .setBluetooth(true)
            .build();
        System.out.println("Gaming Computer: " + gamingComputer);

        // Create a computer with minimal configuration and Bluetooth enabled
        Computer minimalComputer = new Computer.Builder()
            .setCPU("AMD Ryzen 3")
            .setRAM("4GB")
            .setStorage("128GB SSD")
            .setBluetooth(true)
            .build();
        System.out.println("Minimal Computer: " + minimalComputer);
    }
}
