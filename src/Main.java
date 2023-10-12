public class Main {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee simpleCoffee = new Espresso();
        System.out.println("Simple Coffee: Cost = $" + simpleCoffee.cost() + ", Description: " + simpleCoffee.getDescription());

        // Add Milk to the coffee
        Coffee milkCoffee = new Milk(simpleCoffee);
        System.out.println("Milk Coffee: Cost = $" + milkCoffee.cost() + ", Description: " + milkCoffee.getDescription());

        // Add Sugar to the milk coffee
        Coffee sugarMilkCoffee = new Sugar(milkCoffee);
        System.out.println("Sugar Milk Coffee: Cost = $" + sugarMilkCoffee.cost() + ", Description: " + sugarMilkCoffee.getDescription());

        // Create another coffee with different combinations
        Coffee anotherCoffee = new Sugar(new Sugar(new Milk(new Espresso())));
        System.out.println("Another Coffee: Cost = $" + anotherCoffee.cost() + ", Description: " + anotherCoffee.getDescription());
    }
}
