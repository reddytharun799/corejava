package exceptionforpayment;

public enum PaymentStatusEnum {

    FAILED("11","Transaction is failed"),
    INSUFFICIENT_BALANCE("11","Transaction is success");


    private String label;
    private String code;

    PaymentStatusEnum(String label,String code){
        this.label=label;
        this.code=code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;

    }

    public String getcode(){
        return code;
    }





}
