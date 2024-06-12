package factory.buttons;

// Concrete Android button implementation
public class AndroidButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changing size of Android button");
    }
}
