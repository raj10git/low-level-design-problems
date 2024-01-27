package ATMMachine;

public interface UserActions {
    public Boolean depositMoney(Double amount, String accountID);
    public Double withdrawMoney(Double amount, String accountID);
    public Double balanceEnquiry(String accountID);
    public Boolean depositCheque(String accountID);
}
