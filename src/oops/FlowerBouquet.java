package oops;
import java.util.HashMap;
import java.util.Map;

class Flower {
    private String name;
    private double cost;

    public Flower(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

	public String getName() {
		return name;
	}
}

class Bouquet {
    private Map<Flower, Integer> flowers;

    public Bouquet() {
        flowers = new HashMap<>();
    }

    public void addFlower(Flower flower, int quantity) {
        flowers.put(flower, quantity);
    }

    public double calculateCost() {
        double totalCost = 0.0;
        for (Map.Entry<Flower, Integer> entry : flowers.entrySet()) {
            totalCost += entry.getKey().getCost() * entry.getValue();
        }
        return totalCost;
    }
}

public class FlowerBouquet {
    public static void main(String[] args) {
        Flower rose = new Flower("Rose", 1.0);
        Flower jasmine = new Flower("Jasmine", 2.0);
        Flower lily = new Flower("Lily", 3.0);

        Bouquet bouquet = new Bouquet();

        bouquet.addFlower(rose, 5);     
        bouquet.addFlower(jasmine, 3);  
        bouquet.addFlower(lily, 2);

        System.out.println("Total cost of the bouquet: $" + bouquet.calculateCost());
    }
}
