package factory;

// Factory class to return the correct UIFactory based on the platform
public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms supportedPlatforms) {
        if (supportedPlatforms == SupportedPlatforms.ANDROID) {
            return new AndroidFactory();
        } else if (supportedPlatforms == SupportedPlatforms.IOS) {
            return new IOSUIFactory();
        }

        return null;
    }
}
