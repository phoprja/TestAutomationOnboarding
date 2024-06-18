package task2_hometask_factory_pattern.sub_task2.driver_manager.without_capabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import task2_hometask_factory_pattern.sub_task2.driver.Driver;

import static task2_hometask_factory_pattern.sub_task1.driver.DriverFactory.BrowserList.CHROME;

public class ChromeDriverManagerWithoutCapabilities implements Driver {

    @Override
    public WebDriver createInstance() {
        WebDriverManager.getInstance(CHROME.getDisplayName()).setup();
        return new ChromeDriver();
    }
}
