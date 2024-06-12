package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class Confectionery {
    protected String name;
    protected double weight;

    public Confectionery(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Chocolate extends Confectionery {
    private double price;

    public Chocolate(String name, double weight, double price) {
        super(name, weight);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Sweet extends Confectionery {
    private double sugarContent;

    public Sweet(String name, double weight, double sugarContent) {
        super(name, weight);
        this.sugarContent = sugarContent;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Gift {
    private List<Confectionery> confectioneries;

    public Gift() {
        confectioneries = new ArrayList<>();
    }

    public void addConfectionery(Confectionery confectionery) {
        confectioneries.add(confectionery);
    }

    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Confectionery confectionery : confectioneries) {
            totalWeight += confectionery.getWeight();
        }
        return totalWeight;
    }

    public void sortChocolates(SortingOption option) {
        Collections.sort(confectioneries, new Comparator<Confectionery>() {
            @Override
            public int compare(Confectionery c1, Confectionery c2) {
                switch (option) {
                    case BY_NAME:
                        return c1.name.compareTo(c2.name);                     
                        
                    case BY_WEIGHT:
                        return Double.compare(c1.getWeight(), c2.getWeight());
                    case BY_PRICE:
                        if (c1 instanceof Chocolate && c2 instanceof Chocolate) {
                            return Double.compare(((Chocolate) c1).getPrice(), ((Chocolate) c2).getPrice());
                        }
                }
                return 0;
            }
        });
    }

    public List<Chocolate> getChocolatesInPriceRange(double minPrice, double maxPrice) {
        List<Chocolate> chocolatesInRange = new ArrayList<>();
        for (Confectionery confectionery : confectioneries) {
            if (confectionery instanceof Chocolate) {
                Chocolate chocolate = (Chocolate) confectionery;
                if (chocolate.getPrice() >= minPrice && chocolate.getPrice() <= maxPrice) {
                    chocolatesInRange.add(chocolate);
                }
            }
        }
        return chocolatesInRange;
    }
}

enum SortingOption {
    BY_NAME,
    BY_WEIGHT,
    BY_PRICE
}

public class NewYearGiftManagement {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Chocolate", 100, 5);
        Chocolate darkChocolate = new Chocolate("Dark Chocolate", 50, 3);
        Chocolate milkChocolate = new Chocolate("Milk Chocolate", 40, 2.5);
        Sweet lollipop = new Sweet("Lollipop", 20, 15);
        Sweet candy = new Sweet("Candy", 10, 20);

        Gift gift = new Gift();
        gift.addConfectionery(chocolate);
        gift.addConfectionery(darkChocolate);
        gift.addConfectionery(milkChocolate);
        gift.addConfectionery(lollipop);
        gift.addConfectionery(candy);

        double totalWeight = gift.calculateTotalWeight();
        System.out.println("Total weight of the gift: " + totalWeight + " grams");

        gift.sortChocolates(SortingOption.BY_NAME);
        System.out.println("\nSorted chocolates by name:");
        for (Confectionery confectionery : gift.getChocolatesInPriceRange(0, Double.MAX_VALUE)) {
            System.out.println(confectionery);
        }
        
        gift.sortChocolates(SortingOption.BY_WEIGHT);
        System.out.println("\nSorted chocolates by weight:");
        for (Confectionery confectionery : gift.getChocolatesInPriceRange(0, Double.MAX_VALUE)) {
            System.out.println(confectionery);
        }

        gift.sortChocolates(SortingOption.BY_PRICE);
        System.out.println("\nSorted chocolates by price:");
        for (Confectionery confectionery : gift.getChocolatesInPriceRange(0, Double.MAX_VALUE)) {
            System.out.println(confectionery);
        }
       

        double minPrice = 2.0;
        double maxPrice = 3.0;
        List<Chocolate> chocolatesInRange = gift.getChocolatesInPriceRange(minPrice, maxPrice);
        System.out.println("\nChocolates within price range $" + minPrice + " - $" + maxPrice + ": " + chocolatesInRange);
    }
}
