package decorator;

public class Client {
    public static void main(String[] args) {

        // Create a complex ice cream cone with multiple layers of decorations
        IceCreamConeConstituents iceCreamConeConstituents =
                new ChocoChips(
                        new VanillaScoop(
                                new StrawberryScoop(
                                        new ChocoChips(
                                                new ChocolateCone(
                                                        new ChocolateCone(
                                                                new OrangeCone()
                                                        )
                                                )
                                        )
                                )
                        )
                );

        // Print the description and cost of the complex ice cream cone
        System.out.println(iceCreamConeConstituents.getDescription());
        System.out.println(iceCreamConeConstituents.getCost());
    }
}


/*
Explanation:

Component Interface:
IceCreamConeConstituents is the common interface that both the core component and the decorators
implement. It defines the methods getCost() and getDescription().

Concrete Component:
OrangeCone is a concrete implementation of the IceCreamConeConstituents interface. This is the object
that can be decorated.

Decorator Class:
ChocolateCone, VanillaScoop, StrawberryScoop, and ChocoChips are concrete decorators that implement the
IceCreamConeConstituents interface. Each of these decorators has a reference to an
IceCreamConeConstituents object and adds additional behavior (cost and description) to it.

Client:
The Client class demonstrates the use of decorators by wrapping an OrangeCone with multiple decorators.
Each decorator adds its own cost and description to the original component.

By using the Decorator pattern, you can easily add or modify the behavior of objects at runtime without
altering their structure, achieving flexible and reusable code.
 */