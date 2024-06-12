package factory;

import factory.buttons.Button;
import factory.dropdown.DropDown;
import factory.menu.Menu;

// Client class to demonstrate the usage of factory pattern
public class Client {
    public static void main(String[] args) {
        // Create a Flutter instance for Android platform
        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);

        // Create UIFactory based on the platform
        UIFactory uiFactory = flutter.createFactory();
        // Create UI components using the factory
        Button button = uiFactory.createButton();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropdown();
    }
}


/*
Explanation:-

SupportedPlatforms Enum:
Represents the different platforms (ANDROID, IOS).

UIFactory Interface:
Declares methods to create UI components like Button, Menu, and DropDown.

Concrete Factories:
AndroidFactory and IOSUIFactory implement the UIFactory interface to create Android and iOS
specific UI components respectively.

Flutter Class:
Uses the UIFactoryFactory to get the appropriate factory based on the specified platform and
then uses this factory to create the required UI components.

UIFactoryFactory Class:
Contains the static method getUIFactory to return the correct factory based on the platform.

Button Interface and Implementations:
Button interface is implemented by AndroidButton and IOSButton classes which provide
platform-specific behavior for changing the size of the button.

Client Class:
Demonstrates the use of factory pattern by creating a Flutter instance for the Android platform,
creating the corresponding UI factory, and then using it to create and manipulate UI components.
 */
