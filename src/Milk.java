public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
        description = "Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0;
    }
}

