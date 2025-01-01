package LLD.DesignPatterns.Creational.Builder.Implementation;

public class Main {
    public static void main(String[] args) {
        // Example pizza order
        Pizza pizza = new PizzaBuilder()
                .setSize(PizzaSize.MEDIUM)
                .setCrustType(CrustType.THIN)
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.MUSHROOMS)
                .addAddOn(AddOn.EXTRA_CHEESE)
                .addAddOn(AddOn.OLIVE_OIL)
                .build();

        System.out.println(pizza);
        System.out.println("Total cost: $" + pizza.getCost());
    }
}
