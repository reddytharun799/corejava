package exceptionInterfaceAbstarctSBI;

import com.sun.net.httpserver.Authenticator;

import java.util.Date;
import java.util.UUID;

public abstract class SBITranferService implements RBIPayment {
    public Boolean balanceCheck(String accountNumber, Double amount) {
        Account accountBalance = SBIAccountDBService.accountMap.get(accountNumber);
        if (accountBalance != null && accountBalance.getBalance() > amount) {
            return true;
        } else {
            return false;
        }
    }

    protected abstract boolean transactionLimitCheck(Account account, Double amount);


    @Override
    public Payment transfer(String formAccount, String ToAccount, Double amount) throws InsufficientBalanceException {
        Payment p = new Payment();
        // balance check
        //String fromAccount;
        /*if (this.balanceCheck(formAccount, amount)) {
            Account account = SBIAccountDBService.accountMap.get(formAccount);
            // transaction limit
            if (this.transactionLimitCheck(account, amount)) {
                p.setStatus(PaymentStatusEnum.SUCCESS.getLabel());
                p.setTransactionId(UUID.randomUUID().toString());
                p.setUter(UUID.randomUUID().toString());
                p.setTransactionDate(new Date());
                p.setAmount(amount);

            }

        } else {
            throw new InsufficientBalanceException(TransferEnum. INSUFFICIENT_BALANCE.getCode(),TransferEnum.INSUFFICIENT_BALANCE.getLabel());

           if (this.transactionLimitCheck(account, amount)) {
               p.setStatus(PaymentStatusEnum.FAILED.getLabel());
               p.setTransactionId(UUID.randomUUID().toString());
               p.setUter(UUID.randomUUID().toString());
               p.setTransactionDate(new Date());
               p.setAmount(amount);

           }
        }else{
                throw new RuntimeException("Transaction limit exceeded for account: " + formAccount);
            }



    return p;
}*/
        // Balance check
        Account account;
        if (this.balanceCheck(formAccount, amount)) {
            account = SBIAccountDBService.accountMap.get(formAccount);

            // Transaction limit check
            if (this.transactionLimitCheck(account, amount)) {
                p.setStatus(PaymentStatusEnum.SUCCESS.getLabel());
                p.setTransactionId(UUID.randomUUID().toString());
                p.setUter(UUID.randomUUID().toString());
                p.setTransactionDate(new Date());
                p.setAmount(amount);
            }
        } else {
            // Throw InsufficientBalanceException if balance check fails
            throw new InsufficientBalanceException(TransferEnum.INSUFFICIENT_BALANCE.getCode(),
                    TransferEnum.INSUFFICIENT_BALANCE.getLabel());
        }
        if (this.transactionLimitCheck(account, amount)) {
            // Log the failed transaction before throwing exception
            p.setStatus(PaymentStatusEnum.FAILED.getLabel());
            p.setTransactionId(UUID.randomUUID().toString());
           // p.setUter(UUID.randomUUID().toString());
            p.setTransactionDate(new Date());
            p.setAmount(amount);
        } else {

            // Throw RuntimeException for transaction limit exceeded
            throw new RuntimeException("Transaction limit exceeded for account: " + formAccount);
        }

        return p;


    }
}

