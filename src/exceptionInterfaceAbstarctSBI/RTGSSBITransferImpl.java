package exceptionInterfaceAbstarctSBI;

public class RTGSSBITransferImpl extends SBITranferService{
    protected boolean transactionLimitCheck(Account account, Double amount) {

        System.out.println("  Validating transactionLimitCheck for account RTGSSBITransferServiceImpl"+account.getAccount());

        if (amount > 20000 && amount < 100000)
            return true;
        else {
            return  false;
        }
    }

}
