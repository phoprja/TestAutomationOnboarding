package task4_hometask_decorator_pattern;

import task4_hometask_decorator_pattern.business_platform.DesktopWebPage;
import task4_hometask_decorator_pattern.business_platform.MobileWebPage;
import task4_hometask_decorator_pattern.business_platform.WebPage;
import task4_hometask_decorator_pattern.decorator_pattern.ClockWidgetDecorator;
import task4_hometask_decorator_pattern.decorator_pattern.MapsWidgetDecorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        WebPage desktopWebPage = new DesktopWebPage();
        System.out.println("Rank of Desktop WebPage is:- "+ desktopWebPage.getRank() + "\n");
        WebPage mapsWidgetDesktopWebPage = new MapsWidgetDecorator(new DesktopWebPage());
        System.out.println("Rank of Desktop WebPage having Maps widget is:- "+ mapsWidgetDesktopWebPage.getRank() + "\n");
        WebPage clockWidgetDesktopWebPage = new ClockWidgetDecorator(new DesktopWebPage());
        System.out.println("Rank of Desktop WebPage having Clock widget is:- "+ clockWidgetDesktopWebPage.getRank() + "\n");

        WebPage mobileWebPage = new MobileWebPage();
        System.out.println("Rank of Mobile WebPage is:- "+ mobileWebPage.getRank() + "\n");
        WebPage mapsWidgetMobileWebPage = new MapsWidgetDecorator(new MobileWebPage());
        System.out.println("Rank of Mobile WebPage having Maps widget is:- "+ mapsWidgetMobileWebPage.getRank() + "\n");
        WebPage clockWidgetMobileWebPage = new ClockWidgetDecorator(new MobileWebPage());
        System.out.println("Rank of Mobile WebPage having Clock widget is:- "+ clockWidgetMobileWebPage.getRank() + "\n");
    }
}
