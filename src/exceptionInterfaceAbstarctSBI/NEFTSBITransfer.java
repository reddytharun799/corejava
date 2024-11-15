package exceptionInterfaceAbstarctSBI;

public class NEFTSBITransfer extends SBITranferService {
    protected boolean transactionLimitCheck(Account account, Double amount) {

        System.out.println("  Validating transactionLimitCheck for account in NEFTSBITransferServiceImpl"+account.getAccount());

        if (amount < 100000)
            return true;
        else {
            return  false;
        }
    }

}
