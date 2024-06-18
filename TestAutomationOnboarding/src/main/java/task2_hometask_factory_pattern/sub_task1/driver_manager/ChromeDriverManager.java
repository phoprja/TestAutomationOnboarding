package task2_hometask_factory_pattern.sub_task1.driver_manager;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import task2_hometask_factory_pattern.sub_task1.driver.Driver;

import static task2_hometask_factory_pattern.sub_task1.driver.DriverFactory.BrowserList.CHROME;

public class ChromeDriverManager implements Driver {
    @Override
    public WebDriver createInstance() {
        WebDriverManager.getInstance(CHROME.getDisplayName()).setup();
        return new ChromeDriver();
    }
}
