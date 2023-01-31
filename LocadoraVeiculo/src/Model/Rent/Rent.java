package Model.Rent;

import java.time.LocalDate;

import Model.PaymentMethods.Payment;
import Model.People.Customer;
import Model.People.Employee;
import Model.Vehicle.Vehicle;

public class Rent {

    private Payment payment;
    private Customer customer;
    private Employee employee;
    private Vehicle vehicle;
    private String code;
    private LocalDate date;

    

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Rent(Payment payment, Customer customer, Employee employee, Vehicle vehicle, String code) {
        this.setPayment(payment);
        this.setCustomer(customer);
        this.setEmployee(employee);
        this.setVehicle(vehicle);
        this.setCode(code);
        this.setDate(LocalDate.now());
    }

    @Override
    public String toString() {
        String payment = this.payment.toString();
        String employee = this.employee.toString();
        String vehicle = this.vehicle.toString();
        String customer = this.customer.toString();
        String date = this.date.toString();
        String phrase = "Aluguel do veículo (" + vehicle + ") para o cliente (" + customer
                + ") autorizado pelo funcionário (" + employee + ") na data (" + date
                + ") pago pelo meio de pagamento (" + payment + ")";
        return phrase;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
