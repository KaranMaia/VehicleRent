package Model.PaymentMethods;

import Enum.EnumCreditCardFlag;
import Enum.EnumPaymentMethod;

public class CreditCard extends Payment {

    private String cardNumber;
    private EnumCreditCardFlag cardFlag;
    private String cardExpirationDate;
    private String cardCVV;
    private String cardOwnerName;

    public CreditCard(String cardNumber, EnumCreditCardFlag cardFlag, String cardExpirationDate, String cardCVV, String cardOwnerName) {
        this.setCardCVV(cardCVV);
        this.setCardNumber(cardNumber);
        this.setCardFlag(cardFlag);
        this.setCardExpirationDate(cardExpirationDate);
        this.setCardOwnerName(cardOwnerName);
        this.setpaymentMethod(EnumPaymentMethod.METHOD_CREDIT_CARD);
    }

    @Override
    public String toString() {
        String cardNumber = this.getCardNumber();
        String lastDigits = cardNumber.substring(cardNumber.length() - 4);
        cardNumber = this.getpaymentMethod() + " da bandeira " + this.getCardFlag() + " e final ****" + lastDigits;
        return cardNumber;
    }

    private String getCardNumber() {
        return cardNumber;
    }
    private void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    private EnumCreditCardFlag getCardFlag() {
        return cardFlag;
    }
    private void setCardFlag(EnumCreditCardFlag cardFlag) {
        this.cardFlag = cardFlag;
    }
    private String getCardExpirationDate() {
        return cardExpirationDate;
    }
    private void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }
    private String getCardCVV() {
        return cardCVV;
    }
    private void setCardCVV(String cardCVV) {
        this.cardCVV = cardCVV;
    }
    private String getCardOwnerName() {
        return cardOwnerName;
    }
    private void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }
    
}
