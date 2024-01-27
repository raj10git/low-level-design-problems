package PizzaCompany;

public class PizzaClient {
    public static void main(String[] args) {
        Pizza chickenDelightExtraCheese = new ExtraCheese(new ChickenDelight());
        Pizza peppyPaneerExtraVeggies = new ExtraVeggies(new PeppyPaneer());

        System.out.println(chickenDelightExtraCheese.getCost());
        System.out.println(peppyPaneerExtraVeggies.getCost());
    }
}
