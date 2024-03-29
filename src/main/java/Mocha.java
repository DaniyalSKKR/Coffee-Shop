public class Mocha extends CoffeeDecorator{
    private double cost = .60;
    Mocha(Coffee specialCoffee){
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee() + addMocha();
    }

    private double addMocha() {

        System.out.println(" + caramel: $.60");
        return cost;
    }
}
