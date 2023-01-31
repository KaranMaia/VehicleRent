package DAO;

import java.util.HashMap;

import Model.PaymentMethods.*;

public class PaymentDAO extends BaseDAO<String, Payment> {

    @Override
    public HashMap<String, Payment> getAll(HashMap<String, Payment> list) {
        System.out.println("Lista de pagamentos: ");
        for (Payment object : list.values()) {
            System.out.println(object);
        }
        return list; //KKKKKKKKKKKKKKKKKKKK eu ri fazendo um método que volta a mesma lista que eu passei
    }

    @Override
    public Payment getById(HashMap<String, Payment> list, String id) {
        Payment object = list.get(id);
        System.out.println(object);
        return object;
    }

}
