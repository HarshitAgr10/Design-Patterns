package decorator;

// Concrete decorator class for Vanilla Cone
public class VanillaScoop implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    public VanillaScoop(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost() {
        // Add the cost of the Vanilla Scoop to the cost of the wrapped component.
        return iceCreamConeConstituents.getCost() + 10;   // Add Vanilla Scoop cost
    }

    @Override
    public String getDescription() {
        // Append the description of the Vanilla Scoop to the description of the wrapped component.
        return iceCreamConeConstituents.getDescription() +  " + Vanilla Scoop";   // Add description
    }
}
