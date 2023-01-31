package Service;

import java.util.HashMap;

import DAO.PaymentDAO;
import Model.PaymentMethods.Payment;

public class PaymentService {

    static PaymentDAO paymentDAO = new PaymentDAO();
    
    public static HashMap<String, Payment> getPayments(HashMap<String, Payment> list) {
        return paymentDAO.getAll(list);
    }

    public static Payment getPaymentById(HashMap<String, Payment> list, String id) {
        return paymentDAO.getById(list, id);
    }

    public static Payment checkPayment(HashMap<String, Payment> list, String id) throws Exception {
        Payment payment = PaymentService.getPaymentById(list, id);
        if(payment.equals(null)) {
            throw new Exception("Pagamento não efetuado");
        } else {
            return payment;
        }
    }

}
