package task2_hometask_factory_pattern.sub_task2.driver;

import org.openqa.selenium.WebDriver;
import task2_hometask_factory_pattern.sub_task2.driver_manager.with_capabilities.ChromeDriverManagerWithCapabilities;
import task2_hometask_factory_pattern.sub_task2.driver_manager.with_capabilities.FirefoxDriverManagerWithCapabilities;
import task2_hometask_factory_pattern.sub_task2.driver_manager.with_capabilities.IEDriverManagerWithCapabilities;

public class BrowserWithCapabilitiesFactory extends AbstractFactory {
    @Override
    public WebDriver createBrowserInstance(String browser) {
        WebDriver driver = null;
        BrowserList browserType = BrowserList.valueOf(browser.toUpperCase());

        switch (browserType) {
            case CHROME:
                driver = new ChromeDriverManagerWithCapabilities().createInstance();
                break;
            case FIREFOX:
                driver = new FirefoxDriverManagerWithCapabilities().createInstance();
                break;
            case IE:
                driver = new IEDriverManagerWithCapabilities().createInstance();
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
