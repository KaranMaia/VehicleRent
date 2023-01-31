package Service;

import java.util.HashMap;

import DAO.CustomerDAO;
import Model.People.Customer;
import Model.People.People;

public class CustomerService {

    static CustomerDAO customerDAO = new CustomerDAO();

    public static HashMap<String, People> getCustomers(HashMap<String, People> list) {
        return customerDAO.getAll(list);
    }

    public static Customer getCustomerById(HashMap<String, People> list, String id) {
        return customerDAO.getById(list, id);
    }

    public static Customer checkCustomer(HashMap<String, People> list, String id) throws Exception {
        Customer customer = CustomerService.getCustomerById(list, id);
        if(customer.equals(null)) {
            throw new Exception("Cliente não existe");
        } else {
            return customer;
        }
    }
}
