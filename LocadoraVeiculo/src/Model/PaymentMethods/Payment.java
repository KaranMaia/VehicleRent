package Model.PaymentMethods;

import Enum.EnumPaymentMethod;

public abstract class Payment {

    private EnumPaymentMethod paymentMethod;

    public EnumPaymentMethod getpaymentMethod() {
        return paymentMethod;
    }

    public void setpaymentMethod(EnumPaymentMethod payment_Method) {
        paymentMethod = payment_Method;
    }
    
}
