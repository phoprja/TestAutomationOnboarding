package task2_hometask_factory_pattern.sub_task1.driver_manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import task2_hometask_factory_pattern.sub_task1.driver.Driver;

import static task2_hometask_factory_pattern.sub_task1.driver.DriverFactory.BrowserList.IE;

public class IEDriverManager implements Driver {
    public WebDriver createInstance() {
        WebDriverManager.getInstance(IE.getDisplayName()).setup();
        return new InternetExplorerDriver();
    }
}
