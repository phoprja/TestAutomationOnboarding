package task1_hometask_singleton_pattern;

public class CandyMaker {

    private boolean empty;
    private boolean boiled;
    private static CandyMaker instance;

    // This code is only started when the boiler is empty
    private CandyMaker() {
        empty = true;
        boiled = false;
    }

    public synchronized static CandyMaker getInstance() {
        if (instance == null) {
            System.out.println("Creating unique instance of Candy maker class");
            instance = new CandyMaker();
        }
        return instance;
    }

    // To fill the boiler it must be empty, and once its full, we set the empty and boiled flags
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the candyMaker with milk and chocolate mix
        }
    }

    // To drain the boiler, it must be full(non-empty) and also boiled. Once it is drained, we set the empty back to true
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    // To boil the mixture the boiler has to be full and not already boiled.
    // Once its boiled we set the boiled flag to true
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the content to boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[empty=" + empty + ", boiled=" + boiled + "]";
    }
}
