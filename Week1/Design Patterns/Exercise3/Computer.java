public class Computer {
    private String CPU;
    private String RAM;
    private String Storage;
    private String GraphicsCard;
    private boolean hasWiFi;
    private boolean hasBluetooth;

    // Private constructor to be used by the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.GraphicsCard = builder.GraphicsCard;
        this.hasWiFi = builder.hasWiFi;
        this.hasBluetooth = builder.hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + Storage +
                ", GraphicsCard=" + GraphicsCard + ", hasWiFi=" + hasWiFi +
                ", hasBluetooth=" + hasBluetooth + "]";
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String Storage;
        private String GraphicsCard;
        private boolean hasWiFi;
        private boolean hasBluetooth;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public Builder setGraphicsCard(String GraphicsCard) {
            this.GraphicsCard = GraphicsCard;
            return this;
        }

        public Builder setWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        // Build method to create the Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}
