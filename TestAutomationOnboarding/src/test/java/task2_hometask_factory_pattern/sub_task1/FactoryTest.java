package task2_hometask_factory_pattern.sub_task1;

import org.openqa.selenium.WebDriver;
import task2_hometask_factory_pattern.sub_task1.driver.DriverFactory;

import static task2_hometask_factory_pattern.sub_task1.driver.DriverFactory.BrowserList.CHROME;

public class FactoryTest {
    public static void main(String[] args) {
        WebDriver driver = new DriverFactory().createBrowserInstance(String.valueOf(CHROME));
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.quit();
        System.out.println("Custom Chrome, Firefox & IE browsers implemented using Factory pattern");
    }
}
