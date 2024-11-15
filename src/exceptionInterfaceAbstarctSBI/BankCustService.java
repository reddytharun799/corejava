package exceptionInterfaceAbstarctSBI;

public class BankCustService {
    public static void main(String[] args) {


        RetailAccountServiceImpl retailAccountService = new RetailAccountServiceImpl();

        Account a = retailAccountService.createAccount("1234", "22222");
        SBITranferService neftsbitransfer= new NEFTSBITransfer();
        try {
            neftsbitransfer.transfer(a.getAccount(),"1234",1000.0);
            System.out.println("transfer successful");
        }catch (InsufficientBalanceException e){
            System.out.println("Transfer failed"+e.getMessage());
        }
        SBITranferService rtgsSbitransfer=new RTGSSBITransferImpl();
        try {
            rtgsSbitransfer.transfer(a.getAccount(),"1234",100000.0);
            //System.out.println("Successfully transfer");
        }catch (BalanceUnavaliableException | InsufficientBalanceException e){
           // System.out.println("Transfer failed"+e.getMessage());
            throw new RuntimeException(" insufficientbalance in rtgs account");
        }finally {
            System.out.println(" from finally");
        }

    }

}
