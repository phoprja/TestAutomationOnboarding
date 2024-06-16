package java8;

import java.util.ArrayList;
import java.util.List;


class ProductsClass {
    private String name;
    private double price;
    private String category;
    private String grade;

    public ProductsClass(String name, double price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}

public class Task_03_Hometask_FunctionInterface {
    public static void main(String[] args) {
        List<ProductsClass> products = new ArrayList<>();
        products.add(new ProductsClass("Laptop", 35000.0, "Electronics", "Regular"));
        products.add(new ProductsClass("Shirt", 2800.0, "Clothing", "Regular"));
        products.add(new ProductsClass("Watch", 4000.0, "Electronics", "Premium"));
        products.add(new ProductsClass("Smartphone", 25000.0, "Electronics", "Regular"));
        products.add(new ProductsClass("Watch strap", 900.0, "Accessories", "Regular"));
        products.add(new ProductsClass("Phone Case", 700.0, "Accessories", "Regular"));
        products.add(new ProductsClass("PenDrive", 1500.0, "Electronics", "Regular"));
        products.add(new ProductsClass("USB Cable", 500.0, "Electronics", "Regular"));

        CostCalculator totalCostCalculator = productList -> {
            double totalCost = 0.0;
            for (ProductsClass product : productList) {
                totalCost += product.getPrice();
            }
            return totalCost;
        };

        CostCalculator costOver1000Calculator = productList -> {
            double totalCost = 0.0;
            for (ProductsClass product : productList) {
                if (product.getPrice() > 1000) {
                    totalCost += product.getPrice();
                }
            }
            return totalCost;
        };

        CostCalculator electronicCostCalculator = productList -> {
            double totalCost = 0.0;
            for (ProductsClass product : productList) {
                if (product.getCategory().equalsIgnoreCase("Electronics")) {
                    totalCost += product.getPrice();
                }
            }
            return totalCost;
        };

        ProductFilter highPriceElectronicFilter = productList -> {
            List<ProductsClass> filteredProducts = new ArrayList<>();
            for (ProductsClass product : productList) {
                if (product.getPrice() > 1000 && product.getCategory().equalsIgnoreCase("Electronics")) {
                    filteredProducts.add(product);
                }
            }
            return filteredProducts;
        };

        double totalCost = totalCostCalculator.calculate(products);
        System.out.println("Cost of all products in a given list of products: " + totalCost);

        double costOver1000 = costOver1000Calculator.calculate(products);
        System.out.println("\nCost of all products whose prices is > 1000/- in the given list of products: " + costOver1000);

        double electronicCost = electronicCostCalculator.calculate(products);
        System.out.println("\nCost of all electronic products in the given list of products: " + electronicCost);

        List<ProductsClass> highPriceElectronicProducts = highPriceElectronicFilter.filter(products);
        System.out.println("\nAll the products whose price is is > 1000/- and belongs to electronic category:");
        for (ProductsClass product : highPriceElectronicProducts) {
            System.out.println(product);
        }
    }

    interface CostCalculator {
        double calculate(List<ProductsClass> productList);
    }

    interface ProductFilter {
        List<ProductsClass> filter(List<ProductsClass> productList);
    }
}
