package exceptionInterfaceAbstarctSBI;

public interface RetailAccountService extends AccountService {
    Account createAccount(String adhar, String pan);
}
