package PizzaCompany;

public class ExtraCheese implements PizzaToppings{
    Pizza pizza;

    public ExtraCheese (Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost()+30;
    }
}
