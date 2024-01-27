package VendingMachine;

public enum Cash {
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50);

    public int value;
    Cash(int value){
        this.value = value;
    }
}
