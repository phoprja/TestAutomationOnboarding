package task2_hometask_factory_pattern.sub_task2.driver;

import org.openqa.selenium.WebDriver;

public abstract class AbstractFactory {
    public abstract WebDriver createBrowserInstance(String browser);
}
