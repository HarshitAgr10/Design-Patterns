package decorator;

// Concrete decorator class for Chocolate Cone
public class ChocolateCone implements IceCreamConeConstituents {

    // Reference to another IceCreamConeConstituents object
    private IceCreamConeConstituents iceCreamConeConstituents;

    // Default Constructor
    public ChocolateCone() {}

    // Constructor that takes an IceCreamConeConstituents object to wrap
    public ChocolateCone(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost() {
        // If there's a wrapped component, add its cost to the cost of the Chocolate Cone.
        if (iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getCost() + 30;   // Add Chocolate Cone cost
        }
        return 30;   // Base cost for Chocolate Cone
    }

    @Override
    public String getDescription() {
        // If there's a wrapped component, append its description.
        if (iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getDescription() + " + Chocolate Cone";   // Add description
        }
        return "Chocolate Cone";   // Base description for Chocolate Cone
    }
}
