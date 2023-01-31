package Model.People;

import Enum.EnumCreditCardFlag;
import Model.PaymentMethods.CreditCard;
import Model.PaymentMethods.Payment;
import Service.PaymentService;

public class Customer extends People {

    private Payment payment;

    public Customer(String cpf, String name, String paymentId) {
        this.setCpf(cpf);
        this.setName(name);
        // NÃO CONSEGUI PASSAR A LISTA COM OS PAYMENTS, FOI NA MÃO MESMO
        this.setPayment(new CreditCard("1111111111", EnumCreditCardFlag.FLAG_MASTERCARD, "12/28", "111", "Yuri Ada Tech"));
    }

    @Override
    public String toString() {
        String name = this.getName();
        String cpf = this.getCpf();
        String card = this.getPayment().toString();
        String phrase = "Cliente " + name + ", portador do CPF " + cpf + ", com pagamento " + card + ".";

        return phrase;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

}
