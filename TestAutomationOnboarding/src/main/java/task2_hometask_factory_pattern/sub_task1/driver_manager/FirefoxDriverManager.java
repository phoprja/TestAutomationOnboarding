package task2_hometask_factory_pattern.sub_task1.driver_manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import task2_hometask_factory_pattern.sub_task1.driver.Driver;

import static task2_hometask_factory_pattern.sub_task1.driver.DriverFactory.BrowserList.FIREFOX;


public class FirefoxDriverManager implements Driver {
    public WebDriver createInstance() {
        WebDriverManager.getInstance(FIREFOX.getDisplayName()).setup();
        return new FirefoxDriver();
    }
}
