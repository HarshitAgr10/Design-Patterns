package decorator;

// Concrete class implementing the IceCreamConeConstituents interface
public class OrangeCone implements IceCreamConeConstituents {

    @Override
    public int getCost() {
        return 20;   // Base cost for Orange Cone
    }

    @Override
    public String getDescription() {
        return "Orange Cone";   // Base description for Orange Cone
    }

    // Additional method specific to OrangeCone
    public void setVitaminCLevel(int newLevel) {

    }
}
