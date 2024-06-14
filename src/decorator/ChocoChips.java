package decorator;

// Concrete decorator class for Choco Chips
public class ChocoChips implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    public ChocoChips(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 5;   // Add Choco Chips cost
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + " + Choco Chips";   // Add description
    }
}
