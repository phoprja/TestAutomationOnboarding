package task4_hometask_decorator_pattern.decorator_pattern;

import task4_hometask_decorator_pattern.business_platform.WebPage;

public class MapsWidgetDecorator extends WidgetDecorator {
    private final int mapsWidgetRank = 10;
    public MapsWidgetDecorator(WebPage webPageDecorator) {
        super(webPageDecorator);
    }

    @Override
    public int getRank() {
        System.out.println("Adding rank-"+ mapsWidgetRank +" of Maps Widget to the original rank-"+super.getRank()+" of web page");
        return super.getRank() + mapsWidgetRank;
    }
}
