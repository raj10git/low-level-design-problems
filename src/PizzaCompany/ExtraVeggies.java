package PizzaCompany;

public class ExtraVeggies implements PizzaToppings{
    Pizza pizza;
    public ExtraVeggies(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost()+20;
    }
}
