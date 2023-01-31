package Model.PaymentMethods;

import Enum.EnumPaymentMethod;

public class PicPay extends Payment {

    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public PicPay(String user){
        this.setUser(user);
        this.setpaymentMethod(EnumPaymentMethod.METHOD_PICPAY);
    }

    @Override
    public String toString() {
        String phrase = "PicPay no nome de " + this.getUser();
        return phrase;
    }
    
}
