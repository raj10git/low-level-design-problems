package ATMMachine;

import java.util.HashMap;

public class ATMService {
    HashMap<String, UserAccount> usersMap = new HashMap<>();

    public UserAccount getUserAccountByAccountID(String accountID){
        return usersMap.get("");
    }
}
