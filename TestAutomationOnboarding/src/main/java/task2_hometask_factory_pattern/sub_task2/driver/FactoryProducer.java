package task2_hometask_factory_pattern.sub_task2.driver;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean capabilities) {
        if (capabilities)
            return new BrowserWithCapabilitiesFactory();
        else
            return new BrowserWithoutCapabilitiesFactory();
    }
}
