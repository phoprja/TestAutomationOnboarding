package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	private String name;
	private double price;
	private String category;
	private String grade;

	public Product(String name, double price, String category, String grade) {
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
		return "Product{" + "name='" + name + '\'' + ", price=" + price + ", category='" + category + '\'' + ", grade='"
				+ grade + '\'' + '}';
	}
}

class Response {
	private String responseBody;
	private int statusCode;
	private String responseType;

	public Response(String responseBody, int statusCode, String responseType) {
		this.responseBody = responseBody;
		this.statusCode = statusCode;
		this.responseType = responseType;
	}

	@Override
	public String toString() {
		return "Response{" + "responseBody='" + responseBody + '\'' + ", statusCode=" + statusCode + ", responseType='"
				+ responseType + '\'' + '}';
	}
}

public class Task_08_Hometask_Streams {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 1500.0, "Electronics", "A"));
		products.add(new Product("Refrigerator", 1200.0, "Electronics", "B"));
		products.add(new Product("TV", 800.0, "Electronics", "A"));
		products.add(new Product("AC", 400.0, "Electronics", "A"));
		products.add(new Product("Chair", 200.0, "Furniture", "C"));
		products.add(new Product("Sofa", 900.0, "Furniture", "C"));
		products.add(new Product("Mobile", 2000.0, "Electronics", "A"));
		products.add(new Product("Tablet", 600.0, "Electronics", "A"));
		products.add(new Product("Bookshelf", 500.0, "Furniture", "B"));

		// 1. From the given list of the products get all the products with price >
		// 1000/-
		List<Product> expensiveProducts = products.stream().filter(product -> product.getPrice() > 1000.0)
				.collect(Collectors.toList());
		printResponse("Products with price > 1000/-", expensiveProducts);

		// 2. From the given list of the products get all the products from electronics
		// category
		List<Product> electronicsProducts = products.stream()
				.filter(product -> product.getCategory().equals("Electronics")).collect(Collectors.toList());
		printResponse("Products from electronics category", electronicsProducts);

		// 3. From the given list of the products get all the products with price>
		// 1000/- and from electronics category. Change the name of the result list into
		// CAP letters before printing
		List<Product> expensiveElectronics = products.stream()
				.filter(product -> product.getPrice() > 1000.0 && product.getCategory().equals("Electronics"))
				.map(product -> new Product(product.getName().toUpperCase(), product.getPrice(), product.getCategory(),
						product.getGrade()))
				.collect(Collectors.toList());
		printResponse("Products with price > 1000/- and from electronics category (names in CAPS)",
				expensiveElectronics);

		// 4. Calculate the count of all electronic products in the given list of
		// products
		long electronicCount = products.stream().filter(product -> product.getCategory().equals("Electronics")).count();
		System.out.println("Count of electronic products: " + electronicCount);
	}

	private static void printResponse(String message, List<Product> products) {
		System.out.println(message);
		for (Product product : products) {
			System.out.println(product);
		}
		System.out.println();
	}

}
