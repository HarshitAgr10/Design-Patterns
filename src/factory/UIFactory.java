package factory;

import factory.buttons.Button;
import factory.dropdown.DropDown;
import factory.menu.Menu;

// Abstract factory interface for creating UI components
// Contains Factory Methods
public interface UIFactory {

    Button createButton();
    Menu createMenu();
    DropDown createDropdown();
}
