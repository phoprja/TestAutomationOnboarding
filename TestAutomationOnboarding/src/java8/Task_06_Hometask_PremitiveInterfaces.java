package java8;
import java.util.function.IntPredicate;
import java.util.function.IntConsumer;
import java.util.Random;
import java.util.function.IntSupplier;

public class Task_06_Hometask_PremitiveInterfaces {

	public static void main(String[] args) {
		ProductClass product = new ProductClass("Laptop", 54000, "Electronics", 1);
        System.out.println("Product: " + product.getName() + ", Price in Rs: " + product.getPrice() +
                ", Category: " + product.getCategory() + ", Grade: " + product.getGrade());

        int number = 17;
        PrimeNumberPredicate primePredicate = new PrimeNumberPredicate();
        System.out.println(number + " is prime: " + primePredicate.test(number));

        int numToSquare = 10;
        SquarePrinter squarePrinter = new SquarePrinter();
        squarePrinter.accept(numToSquare);

        RandomIntSupplier randomIntSupplier = new RandomIntSupplier();
        int randomInt = randomIntSupplier.getAsInt();
        System.out.println("Random number below 5000: " + randomInt);
    }
	
}


class RandomIntSupplier implements IntSupplier {
    private Random random = new Random();

    @Override
    public int getAsInt() {
        return random.nextInt(5000);
    }
}

class SquarePrinter implements IntConsumer {
    @Override
    public void accept(int number) {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

class PrimeNumberPredicate implements IntPredicate {
    @Override
    public boolean test(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


class ProductClass {
    private String name;
    private double price;
    private String category;
    private int grade;

    public ProductClass(String name, double price, String category, int grade) {
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

    public int getGrade() {
        return grade;
    }
}
