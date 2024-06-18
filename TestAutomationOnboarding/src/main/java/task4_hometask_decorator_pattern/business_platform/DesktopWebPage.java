package task4_hometask_decorator_pattern.business_platform;

public class DesktopWebPage implements WebPage {
    private final int rank = 40;
    @Override
    public int getRank() {
        return rank;
    }
}
