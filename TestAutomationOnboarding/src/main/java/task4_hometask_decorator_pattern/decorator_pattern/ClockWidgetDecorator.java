package task4_hometask_decorator_pattern.decorator_pattern;

import task4_hometask_decorator_pattern.business_platform.WebPage;

public class ClockWidgetDecorator extends WidgetDecorator {
    private final int clocksWidgetRank = 5;

    public ClockWidgetDecorator(WebPage webPageDecorator) {
        super(webPageDecorator);
    }

    @Override
    public int getRank() {
        System.out.println("Adding rank-"+ clocksWidgetRank +" of Maps Widget to the original rank-"+super.getRank()+" of web page");
        return super.getRank() + clocksWidgetRank;
    }
}
