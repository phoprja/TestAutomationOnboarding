package task2_hometask_factory_pattern.sub_task2.driver_manager.with_capabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import task2_hometask_factory_pattern.sub_task2.driver.Driver;

import static task2_hometask_factory_pattern.sub_task1.driver.DriverFactory.BrowserList.FIREFOX;

public class FirefoxDriverManagerWithCapabilities implements Driver {
    @Override
    public WebDriver createInstance() {
        WebDriverManager.getInstance(FIREFOX.getDisplayName()).setup();
        return new FirefoxDriver(getOptions());
    }

    public FirefoxOptions getOptions() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--disable-notifications");
        System.out.println("Capabilities set for Firefox browser");
        return firefoxOptions;
    }
}
