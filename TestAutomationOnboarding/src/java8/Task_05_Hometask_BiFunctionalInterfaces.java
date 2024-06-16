package java8;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Task_05_Hometask_BiFunctionalInterfaces {
	
	public static void main(String[] args) {
		System.out.println("Created products using BiFunction are: " );
		BiFunction<String, Double, ProductDetails> createProductLaptop = (name, price) -> new ProductDetails(name, price, "Electronics", 1);
		ProductDetails laptop = createProductLaptop.apply("Laptop", 35000.0);
        System.out.println(laptop);      
        
        BiFunction<String, Double, ProductDetails> createProductPhone = (name, price) -> new ProductDetails(name, price, "Electronics", 2);
		ProductDetails phone = createProductPhone.apply("Phone", 25000.0);
        System.out.println(phone);
       
        
        BiFunction<Map<ProductDetails, Integer>, BiFunction<String, Double, ProductDetails>, Double> calculateCartCost =
                (cart, productCreator) -> {
                    double totalCost = 0.0;
                    for (Map.Entry<ProductDetails, Integer> entry : cart.entrySet()) {
                    	ProductDetails product = entry.getKey();
                        int quantity = entry.getValue();
                        totalCost += product.getPrice() * quantity;
                    }
                    return totalCost;
                };

        Map<ProductDetails, Integer> cart = new HashMap<>();
        cart.put(laptop, 2);  
        double cartCost = calculateCartCost.apply(cart, createProductLaptop);
        System.out.println("\nTotal cost of the cart having 2 laptops: $" + cartCost);

    }
}

class ProductDetails {
    private String name;
    private double price;
    private String category;
    private int grade;

    public ProductDetails(String name, double price, String category, int grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", grade=" + grade +
                '}';
    }
}
