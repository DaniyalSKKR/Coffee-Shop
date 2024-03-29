public class CoffeeOrder {
    private Coffee order;

    CoffeeOrder(){
        order = new BasicCoffee();
    }
    void addSugar(){
        order = new Sugar(order);
    }
    void addCream(){
        order = new Cream(order);
    }
    void addShot(){
        order = new ExtraShot(order);
    }
    void addCaramel(){
        order = new Caramel(order);
    }
    void addMocha(){
        order = new Mocha(order);
    }

    public Coffee getOrder() {
        return order;
    }
}
