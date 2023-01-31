package Payment;

//IMPLEMENTAR NO NOVO PAYMENT

public class PaymentService {

    private float total;

    public void runPayment(IPaymentStrategy strategy) throws Exception{
        strategy.collectPaymentInfo();
        if(strategy.validatePayment()){
            strategy.pay(getTotal());
        } else {
            throw new Exception("Pagamento inválido");
        }
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

}
