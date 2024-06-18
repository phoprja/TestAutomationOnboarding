package task2_hometask_factory_pattern.sub_task1.driver;

import org.openqa.selenium.WebDriver;
import task2_hometask_factory_pattern.sub_task1.driver_manager.ChromeDriverManager;
import task2_hometask_factory_pattern.sub_task1.driver_manager.FirefoxDriverManager;
import task2_hometask_factory_pattern.sub_task1.driver_manager.IEDriverManager;

public class DriverFactory {
    public WebDriver createBrowserInstance(String browser) {
        WebDriver driver = null;
        BrowserList browserType = BrowserList.valueOf(browser.toUpperCase());

        switch (browserType) {

            case CHROME:
                driver = new ChromeDriverManager().createInstance();
                break;
            case FIREFOX:
                driver = new FirefoxDriverManager().createInstance();
                break;
            case IE:
                driver = new IEDriverManager().createInstance();
                break;
        }
        return driver;
    }

    public enum BrowserList {
        CHROME("CHROME"), FIREFOX("FIREFOX"), IE("INTERNET EXPLORER");

        final String displayName;
        BrowserList(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
}
