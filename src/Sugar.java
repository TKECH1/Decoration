public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
        description = "Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
}