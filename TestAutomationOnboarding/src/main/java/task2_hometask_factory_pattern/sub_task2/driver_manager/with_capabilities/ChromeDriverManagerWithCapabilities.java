package task2_hometask_factory_pattern.sub_task2.driver_manager.with_capabilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import task2_hometask_factory_pattern.sub_task2.driver.Driver;

import static task2_hometask_factory_pattern.sub_task1.driver.DriverFactory.BrowserList.CHROME;

public class ChromeDriverManagerWithCapabilities implements Driver {
    @Override
    public WebDriver createInstance() {
        WebDriverManager.getInstance(CHROME.getDisplayName()).setup();
        return new ChromeDriver(getOptions());
    }

    private ChromeOptions getOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        System.out.println("Capabilities set for Chrome browser");
        return chromeOptions;
    }
}
