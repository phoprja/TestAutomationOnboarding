package task2_hometask_factory_pattern.sub_task2;

import org.openqa.selenium.WebDriver;
import task2_hometask_factory_pattern.sub_task2.driver.AbstractFactory;
import task2_hometask_factory_pattern.sub_task2.driver.FactoryProducer;

import static task2_hometask_factory_pattern.sub_task1.driver.DriverFactory.BrowserList.CHROME;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factoryWithCapabilities = FactoryProducer.getFactory(true);
        WebDriver driverWithCapabilities = factoryWithCapabilities.createBrowserInstance(String.valueOf(CHROME));
        System.out.println("Browser driver with capabilities initialized");
        driverWithCapabilities.manage().window().maximize();
        driverWithCapabilities.get("https://www.google.com");
        driverWithCapabilities.quit();

        AbstractFactory factoryWithoutCapabilities = FactoryProducer.getFactory(false);
        WebDriver driverWithoutCapabilities = factoryWithoutCapabilities.createBrowserInstance(String.valueOf(CHROME));
        System.out.println("Browser driver without capabilities initialized");
        driverWithoutCapabilities.manage().window().maximize();
        driverWithoutCapabilities.get("https://www.google.com");
        driverWithoutCapabilities.quit();
    }
}
