package oops;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Appliance {
    private String name;
    private int powerConsumption;

    public Appliance(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public String toString() {
        return name + " (Power Consumption: " + powerConsumption + " units)";
    }
}

class Home {
    private List<Appliance> appliances;

    public Home() {
        appliances = new ArrayList<>();
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public int calculateTotalPowerConsumption() {
        int totalPowerConsumption = 0;
        for (Appliance appliance : appliances) {
            totalPowerConsumption += appliance.getPowerConsumption();
        }
        return totalPowerConsumption;
    }

    public void sortByName() {
        Collections.sort(appliances, Comparator.comparing(Appliance::toString));
    }

    public void sortByPowerConsumption() {
        Collections.sort(appliances, Comparator.comparingInt(Appliance::getPowerConsumption));
    }

    public void displayAppliances() {
        for (Appliance appliance : appliances) {
            System.out.println(appliance);
        }
    }
}

public class HomeApplianceManagement {
    public static void main(String[] args) {
        Appliance fan = new Appliance("Fan", 1);
        Appliance light = new Appliance("Light", 2);
        Appliance tv = new Appliance("TV", 3);
        Appliance laptop = new Appliance("Laptop", 4);

        Home home = new Home();
        home.addAppliance(fan);
        home.addAppliance(light);
        home.addAppliance(tv);
        home.addAppliance(laptop);

        int totalPowerConsumption = home.calculateTotalPowerConsumption();
        System.out.println("Total power consumption: " + totalPowerConsumption + " units");

        System.out.println("\nSorted appliances by name:");
        home.sortByName();
        home.displayAppliances();

        System.out.println("\nSorted appliances by power consumption:");
        home.sortByPowerConsumption();
        home.displayAppliances();
    }
}
