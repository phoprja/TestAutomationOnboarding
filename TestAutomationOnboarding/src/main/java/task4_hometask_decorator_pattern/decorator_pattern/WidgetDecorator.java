package task4_hometask_decorator_pattern.decorator_pattern;

import task4_hometask_decorator_pattern.business_platform.WebPage;

public abstract class WidgetDecorator implements WebPage {
    protected WebPage webPageDecorator;
    public WidgetDecorator(WebPage webPageDecorator) {
        this.webPageDecorator = webPageDecorator;
    }

    @Override
    public int getRank() {
        return webPageDecorator.getRank();
    }
}
