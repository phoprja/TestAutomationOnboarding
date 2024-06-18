package task4_hometask_decorator_pattern.business_platform;

public class MobileWebPage implements WebPage {
    private final int rank = 50;
    @Override
    public int getRank() {
        return rank;
    }
}
