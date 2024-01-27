package VendingMachine.VendingStates;

import VendingMachine.VendingMachine;
import VendingMachine.Item;

import java.util.List;

public interface State {

    public void insertCoinButton(VendingMachine machine) throws Exception;

    public void selectProductButton(VendingMachine machine) throws Exception;

    public void enterProductCode(VendingMachine machine) throws Exception;

    public int refundChange(VendingMachine machine) throws Exception;

    public void dispenseProduct(VendingMachine machine) throws Exception;

    public int refundFullMoney(VendingMachine machine) throws Exception;

    public List<Item> updateInventory(VendingMachine machine) throws Exception;
}
