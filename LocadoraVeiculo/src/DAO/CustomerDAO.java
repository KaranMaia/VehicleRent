package DAO;

import java.util.HashMap;

import Model.People.Customer;
import Model.People.People;

public class CustomerDAO extends PeopleDAO{
    
    @Override
    public HashMap<String, People> getAll(HashMap<String, People> list) {
        System.out.println("Lista de clientes: ");
        for(Object object : list.values()) {
            if(object.getClass().equals(Customer.class))
                System.out.println(object);
        }

        return list;
    }

    @Override
    public Customer getById(HashMap<String, People> list, String id) {
        Object object = list.get(id);
        if(object.getClass().equals(Customer.class)) {
                System.out.println(object);
        } else {
            System.out.println("Não é cliente");
        }

        return (Customer) object;

    }
}
