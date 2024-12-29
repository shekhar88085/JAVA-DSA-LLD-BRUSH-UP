package LLD.DesignPatterns.Creational.Builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Building a high-performance gaming computer
        Computer gamingComputer = new Computer.ComputerBuilder("Intel i9", "32GB")
                .setStorage("2TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setCoolingSystem(true)
                .setWiFi(true)
                .build();

        System.out.println(gamingComputer);

        // Building a budget computer
        Computer budgetComputer = new Computer.ComputerBuilder("Intel i3", "8GB")
                .setStorage("512GB HDD")
                .setWiFi(true)
                .build();

        System.out.println(budgetComputer);
    }
}
