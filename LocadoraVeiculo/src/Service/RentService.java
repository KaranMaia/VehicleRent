package Service;

import java.util.HashMap;

import DAO.RentDAO;
import Model.*;
import Model.PaymentMethods.Payment;
import Model.People.Customer;
import Model.People.Employee;
import Model.People.People;
import Model.Rent.Rent;
import Model.Vehicle.*;

public class RentService {

    static RentDAO rentDAO = new RentDAO();

    public static HashMap<String, Rent> getRents(HashMap<String, Rent> list) {
        return rentDAO.getAll(list);
    }

    public static Rent getRentById(HashMap<String, Rent> list, String id) {
        return rentDAO.getById(list, id);
    }

    public static void addRent(HashMap<String, Rent> rentList, Rent rent) {
        rentDAO.insert(rentList, rent.getCode(), rent);
    }


    public static void doRent(String vehicleId,HashMap<String, Vehicle> vehicleList, String paymentId, HashMap<String, Payment> paymentList, String customerId, String employeeId, HashMap<String, People> peopleList, HashMap<String, Rent> rentList, String code) throws Exception {
        Vehicle vehicle = VehicleService.checkAvailability(vehicleId, vehicleList);
        Payment payment = PaymentService.checkPayment(paymentList, paymentId);
        Customer customer = CustomerService.checkCustomer(peopleList, customerId);
        Employee employee = EmployeeService.checkEmployee(peopleList, employeeId);

        Rent rent = new Rent(payment, customer, employee, vehicle, code);
        RentService.addRent(rentList, rent);
    }
}
