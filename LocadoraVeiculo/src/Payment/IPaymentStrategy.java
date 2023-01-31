package Payment;

import Model.PaymentMethods.Payment;

//IMPLEMENTAR NO NOVO PAYMENT

public interface IPaymentStrategy{
    public void pay(float amount);
    public void collectPaymentInfo();
    public boolean validatePayment();
}