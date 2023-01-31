import java.util.HashMap;

import DAO.*;
import Enum.EnumVehicleCategory;
import Model.*;
import Model.PaymentMethods.Payment;
import Model.People.Employee;
import Model.People.People;
import Model.Rent.Rent;
import Model.Vehicle.*;
import Seed.Seed;
import Service.RentService;

public class App {

    
    public static void main(String[] args) throws Exception {

        
        HashMap<String, Vehicle> listOfVehicles = new HashMap<>();
        HashMap<String, People> listOfPeople = new HashMap<>();
        HashMap<String, Payment> listOfPayment = new HashMap<>();
        HashMap<String, Rent> listOfRents = new HashMap<>();

        Seed.seedVehicle(listOfVehicles);
        // VehicleDAO vehicleDAO = new VehicleDAO();
        // vehicleDAO.getAll(listOfVehicles);

        Seed.seedPeople(listOfPeople);
        // PeopleDAO peopleDAO = new PeopleDAO();
        // peopleDAO.getAll(listOfPeople);
        
        Seed.seedPayment(listOfPayment);
        // PaymentDAO paymentDAO = new PaymentDAO();
        // paymentDAO.getAll(listOfPayment);

        RentService.doRent("YAT0001", listOfVehicles, "1111111111", listOfPayment, "015015", "F0001", listOfPeople, listOfRents, "TESTE");
        
        System.out.println("====================================================================");
        
        RentService.getRents(listOfRents);

    }

    public static void showList(HashMap<String, Vehicle> list) {
        System.out.println("Lista de veículos:");
        for(Vehicle object : list.values()) {
            System.out.println(object);
        }
    }
}
