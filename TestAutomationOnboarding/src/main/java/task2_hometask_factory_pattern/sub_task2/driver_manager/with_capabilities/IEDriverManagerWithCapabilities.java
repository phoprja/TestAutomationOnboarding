package task2_hometask_factory_pattern.sub_task2.driver_manager.with_capabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import task2_hometask_factory_pattern.sub_task2.driver.Driver;

import static task2_hometask_factory_pattern.sub_task1.driver.DriverFactory.BrowserList.IE;

public class IEDriverManagerWithCapabilities implements Driver {
    @Override
    public WebDriver createInstance() {
        WebDriverManager.getInstance(IE.getDisplayName()).setup();
        return new InternetExplorerDriver(getOptions());
    }

    public InternetExplorerOptions getOptions() {
        InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
        internetExplorerOptions.setAcceptInsecureCerts(true);
        System.out.println("Capabilities set for IE browser");
        return internetExplorerOptions;
    }
}
