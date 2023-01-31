package Payment;

import Enum.EnumCreditCardFlag;
import Model.PaymentMethods.CreditCard;
import Model.PaymentMethods.Payment;

//IMPLEMENTAR NO NOVO PAYMENT

public class CreditCardPayment implements IPaymentStrategy{

    @Override
    public void pay(float amount) { 
        System.out.println("Processando pagamento...");        
    }

    @Override
    public void collectPaymentInfo() {
        System.out.println("Coletando informações do cartão...");
        Payment card = new CreditCard("123456789", EnumCreditCardFlag.FLAG_MASTERCARD, "02/28", "964", "Yuri Ada Tech");
    }

    @Override
    public boolean validatePayment() {
        return CreditCardValidate.isValid();
    }
    
}