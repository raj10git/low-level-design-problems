package VendingMachine.VendingStates.impl;

import VendingMachine.VendingMachine;
import VendingMachine.VendingStates.State;
import VendingMachine.Item;

import java.util.List;

public class SelectionState implements State {
    @Override
    public void insertCoinButton(VendingMachine machine) throws Exception {

    }

    @Override
    public List<Item> updateInventory(VendingMachine machine) throws Exception {
        return null;
    }

    @Override
    public int refundFullMoney(VendingMachine machine) throws Exception {
        return 0;
    }

    @Override
    public void dispenseProduct(VendingMachine machine) throws Exception {

    }

    @Override
    public int refundChange(VendingMachine machine) throws Exception {
        return 0;
    }

    @Override
    public void enterProductCode(VendingMachine machine) throws Exception {

    }

    @Override
    public void selectProductButton(VendingMachine machine) throws Exception {

    }
}
