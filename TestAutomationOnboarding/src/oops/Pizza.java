package oops;

import java.util.ArrayList;
import java.util.List;

class Pizza {
    private String base;
    private List<String> toppings;
    private double baseCost;
    private double toppingCost;

    public Pizza(String base, double baseCost) {
        this.base = base;
        this.baseCost = baseCost;
        this.toppings = new ArrayList<>();
        this.toppingCost = 0.0;
    }

    public void addTopping(String topping, double toppingCost) {
        this.toppings.add(topping);
        this.toppingCost += toppingCost;
    }

    public double calculateCost() {
        return baseCost + toppingCost;
    }

    public String getBase() {
        return base;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public static void main(String[] args) {
        Pizza pizzaStandardBase = new Pizza("Standard", 4.99);
        pizzaStandardBase.addTopping("Tomato", 0.99);
        pizzaStandardBase.addTopping("Corn", 0.99);
        pizzaStandardBase.addTopping("Mushrooms", 1.99);
        System.out.println("Pizza Cost: $" + pizzaStandardBase.calculateCost());
        System.out.println("Selected Base: " + pizzaStandardBase.getBase());
        System.out.println("Selected Toppings: " + pizzaStandardBase.getToppings());
        System.out.println();

        Pizza pizzaSoftBase = new Pizza("Soft", 5.99);
        pizzaSoftBase.addTopping("Tomato", 0.99);
        pizzaSoftBase.addTopping("Corn", 0.99);
        pizzaSoftBase.addTopping("Mushrooms", 1.99);
        System.out.println("Pizza Cost: $" + pizzaSoftBase.calculateCost());
        System.out.println("Selected Base: " + pizzaSoftBase.getBase());
        System.out.println("Selected Toppings: " + pizzaSoftBase.getToppings());
    }
}