public class Caramel extends CoffeeDecorator{

    private double cost = .60;
    Caramel(Coffee specialCoffee){
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee() + addCaramel();
    }

    private double addCaramel() {

        System.out.println(" + caramel: $.60");

        return cost;
    }
}
