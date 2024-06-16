package java8;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_04_Hometask_Consumer_Supplier {
    public static void main(String[] args) {
        List<Products> products = new ArrayList<>();
        products.add(new Products("Phone Case", 700.0, "Accessories", "Regular"));
        products.add(new Products("Laptop", 35000.0, "Electronics", "Regular"));
        products.add(new Products("Shirt", 2800.0, "Clothing", "Regular"));
        products.add(new Products("Watch", 8000.0, "Accessories", "Regular"));
        products.add(new Products("Watch strap", 900.0, "Accessories", "Regular"));

        System.out.println("Printing all Products:");
        Consumer.printProducts(products);

        System.out.println("\nProducts printed to file: Check products.log file");
        for (Products product : products) {
            Consumer.printProduct(product, "file");
        }

        System.out.println("\nProducts with updated grade as Premium for price > 1000:");
        Consumer.updatePremiumGrade(products);

        System.out.println("\nProducts with names updated with suffix as * for price > 3000:");
        Consumer.updateNameForHighPricedProducts(products);

        System.out.println("\nPremium grade products with name suffixed with '*':");
        Consumer.printPremiumProducts(products);

        System.out.println("\nRandomly generated product:");
        Products randomProduct = Supplier.generateRandomProduct();
        System.out.println(randomProduct);

        System.out.println("\nRandomly generated OTP:");
        String otp = Supplier.generateRandomOTP();
        System.out.println(otp);
    }
}

class Products {
    private String name;
    private double price;
    private String category;
    private String grade;

    public Products(String name, double price, String category, String grade) {
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

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
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

class Consumer {
	
    public static void printProduct(Products product, String printType) {
        if (printType.equalsIgnoreCase("file")) {
            logToFile(product);
        } else {
            System.out.println(product);
        }
    }

    public static void updatePremiumGrade(List<Products> products) {
        for (Products product : products) {
            if (product.getPrice() > 1000) {
                product.setGrade("Premium");
            }
        }
        printProducts(products);
    }

    public static void updateNameForHighPricedProducts(List<Products> products) {
        for (Products product : products) {
            if (product.getPrice() > 3000) {
                product.setName(product.getName() + "*");
            }
        }
        printProducts(products);
    }

    public static void printPremiumProducts(List<Products> products) {
        List<Products> premiumProducts = new ArrayList<>();
        for (Products product : products) {
            if ((product.getGrade().equalsIgnoreCase("Premium")) && (product.getName().contains("*") )) {
                premiumProducts.add(product);
            }
        }
        printProducts(premiumProducts);
    }

    static void printProducts(List<Products> products) {
        for (Products product : products) {
            System.out.println(product);
        }
    }

    private static void logToFile(Products product) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("products.log", true))) {
            writer.println(product);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Supplier {
    private static final Random random = new Random();

    public static Products generateRandomProduct() {
        String[] categories = {"Electronics", "Clothing", "Books", "Home Appliances"};
        String[] grades = {"Regular", "Premium"};
        String category = categories[random.nextInt(categories.length)];
        double price = random.nextDouble() * 5000; 
        String grade = grades[random.nextInt(grades.length)];
        return new Products("Random Product", price, category, grade);
    }

    public static String generateRandomOTP() {
        int otp = 100000 + random.nextInt(900000); 
        return String.valueOf(otp);
    }
}

