package factory.buttons;

// Concrete iOS button implementation
public class IOSButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changing size of IOS button");
    }
}
