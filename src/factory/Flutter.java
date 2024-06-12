package factory;

// Main class to create UI based on the specified platform
public class Flutter {
    private SupportedPlatforms supportedPlatforms;
    public Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate");
    }

    // Factory method to get the appropriate UIFactory based on the platform
    public UIFactory createFactory() {
//        if (supportedPlatforms == SupportedPlatforms.ANDROID) {
//            return new AndroidFactory();
//        } else if (supportedPlatforms == SupportedPlatforms.IOS) {
//            return new IOSUIFactory();
//        }
//        return null;

        return UIFactoryFactory.getUIFactory(supportedPlatforms);
    }
}
