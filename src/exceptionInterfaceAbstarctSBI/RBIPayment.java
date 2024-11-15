package exceptionInterfaceAbstarctSBI;

import exceptionforpayment.InsufficientfundExecption;

public interface RBIPayment {



    Payment transfer(String formAccount,String ToAccount,Double amount)throws InsufficientBalanceException;
}
