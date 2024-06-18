package task1_hometask_singleton_pattern;

public class CandyMakerTest {
    public static void main(String[] args) {
        CandyMaker candyMaker = CandyMaker.getInstance();
        candyMaker.fill();
        candyMaker.boil();
        candyMaker.drain();
        System.out.println("Candy Maker class first instance:- " + candyMaker);

        // Returns the same instance
        CandyMaker candyMaker1 = CandyMaker.getInstance();
        System.out.println("Candy Maker class second instance:- " + candyMaker1);
    }
}
