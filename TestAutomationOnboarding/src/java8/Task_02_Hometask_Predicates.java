package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class ProductDetailsClass {
    String name;
    double price;
    String category;
    int grade;

    public ProductDetailsClass(String name, double price, String category, int grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category='" + category + "', grade=" + grade + "}";
    }
}

class ResponseClass {
    String responseBody;
    int statusCode;
    String responseType;

    public ResponseClass(String responseBody, int statusCode, String responseType) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }

    @Override
    public String toString() {
        return "Response{responseBody='" + responseBody + "', statusCode=" + statusCode + ", responseType='" + responseType + "'}";
    }
}

public class Task_02_Hometask_Predicates {
    public static void main(String[] args) {
        List<ProductDetailsClass> products = new ArrayList<>();
        products.add(new ProductDetailsClass("Laptop", 45000.0, "Electronics", 5));
        products.add(new ProductDetailsClass("Smartphone", 22000.0, "Electronics", 4));
        products.add(new ProductDetailsClass("AC", 42000.0, "Electronics", 8));
        products.add(new ProductDetailsClass("Shirt", 2800.0, "Clothing", 6));
        products.add(new ProductDetailsClass("Watch", 8000.0, "Accessories", 2));
        products.add(new ProductDetailsClass("Watch strap", 900.0, "Accessories", 2));
        products.add(new ProductDetailsClass("Phone Case", 700.0, "Accessories", 2));
        products.add(new ProductDetailsClass("USB", 50.0, "Electronics", 9));
        products.add(new ProductDetailsClass("Book", 200.0, "Books", 3));
        products.add(new ProductDetailsClass("Novel", 80.0, "Books", 3));

        List<ResponseClass> responses = new ArrayList<>();
        responses.add(new ResponseClass("{\"message\": \"Bad Request\"}", 400, "JSON"));
        responses.add(new ResponseClass("<html><body>Bad Request</body></html>", 400, "HTML"));
        responses.add(new ResponseClass("{\"message\": \"Not Found Error\"}", 404, "JSON"));
        responses.add(new ResponseClass("<html><body>Not Found Error</body></html>", 404, "HTML"));
        responses.add(new ResponseClass("{\"data\": {Success}}", 200, "JSON"));

        Predicate<ProductDetailsClass> priceGreaterThan1000 = product -> product.price > 1000.0;
        Predicate<ProductDetailsClass> electronicsCategory = product -> product.category.equals("Electronics");
        Predicate<ResponseClass> statusCode400 = response -> response.statusCode == 400;
        Predicate<ResponseClass> responseTypeJSON = response -> response.responseType.equals("JSON");

        System.out.println("Products with price greater than 1000:");
        products.stream()
                .filter(priceGreaterThan1000)
                .forEach(System.out::println);

        System.out.println("\nProducts in electronics category:");
        products.stream()
                .filter(electronicsCategory)
                .forEach(System.out::println);

        System.out.println("\nProducts with price > 100 in electronics category:");
        products.stream()
                .filter(product -> product.price > 100 && product.category.equals("Electronics"))
                .forEach(System.out::println);

        System.out.println("\nProducts with price > 100 or in electronics category:");
        products.stream()
                .filter(product -> product.price > 100 || product.category.equals("Electronics"))
                .forEach(System.out::println);

        System.out.println("\nProducts with price < 100 and in electronics category:");
        products.stream()
                .filter(product -> product.price < 100 && product.category.equals("Electronics"))
                .forEach(System.out::println);

        System.out.println("\nResponses with status code 400:");
        responses.stream()
                .filter(statusCode400)
                .forEach(System.out::println);

        System.out.println("\nResponses with response type JSON:");
        responses.stream()
                .filter(responseTypeJSON)
                .forEach(System.out::println);

        System.out.println("\nResponses with status code 400 and response type JSON:");
        responses.stream()
                .filter(statusCode400.and(responseTypeJSON))
                .forEach(System.out::println);

        System.out.println("\nResponses with status code 400 or response type JSON:");
        responses.stream()
                .filter(statusCode400.or(responseTypeJSON))
                .forEach(System.out::println);

        System.out.println("\nResponses with status code not 400 and response type JSON:");
        responses.stream()
                .filter(statusCode -> statusCode.statusCode != 400)
                .filter(responseTypeJSON)
                .forEach(System.out::println);
    }
}
