package decorator;

// Concrete decorator class for Strawberry Cone
public class StrawberryScoop implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    public StrawberryScoop(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 15;   // Add Strawberry Scoop cost
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + " + Strawberry Scoop";   // Add description
    }
}
