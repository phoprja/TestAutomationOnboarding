package task2_hometask_factory_pattern.sub_task2.driver;

import org.openqa.selenium.WebDriver;
import task2_hometask_factory_pattern.sub_task2.driver_manager.without_capabilities.ChromeDriverManagerWithoutCapabilities;
import task2_hometask_factory_pattern.sub_task2.driver_manager.without_capabilities.FirefoxDriverManagerWithoutCapabilities;
import task2_hometask_factory_pattern.sub_task2.driver_manager.without_capabilities.IEDriverManagerWithoutCapabilities;

public class BrowserWithoutCapabilitiesFactory extends AbstractFactory {
    @Override
    public WebDriver createBrowserInstance(String browser) {
        WebDriver driver = null;
        BrowserList browserType = BrowserList.valueOf(browser.toUpperCase());

        switch (browserType) {
            case CHROME:
                driver = new ChromeDriverManagerWithoutCapabilities().createInstance();
                break;
            case FIREFOX:
                driver = new FirefoxDriverManagerWithoutCapabilities().createInstance();
                break;
            case IE:
                driver = new IEDriverManagerWithoutCapabilities().createInstance();
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
