package Seed;

import java.util.HashMap;

import DAO.*;
import Enum.EnumCreditCardFlag;
import Enum.EnumVehicleCategory;
import Model.PaymentMethods.CreditCard;
import Model.PaymentMethods.Payment;
import Model.PaymentMethods.PicPay;
import Model.People.*;
import Model.People.People;
import Model.Vehicle.*;

public class Seed {

    public static void seedVehicle(HashMap<String, Vehicle> list) {
        VehicleDAO vehicleDAO = new VehicleDAO();
        vehicleDAO.insert(list, "YAT0001", new Car("YAT0001", EnumVehicleCategory.MODEL_SPORT, "Ferrari", 89));
        vehicleDAO.insert(list, "ALTASAVENTURAS01", new Car("ALTASAVENTURAS01", EnumVehicleCategory.MODEL_COUPE, "UP", 56));
        vehicleDAO.insert(list, "MAT0001", new Motorcycle("MAT0001", EnumVehicleCategory.MODEL_MOTORCYCLE, "Harley Davidson", 99));
        vehicleDAO.insert(list, "BMX0001", new Bicycle("BMX0001", EnumVehicleCategory.MODEL_BICYCLE, "BMX", 0));
        vehicleDAO.insert(list, "ICEBERG", new Boat("ICEBERG", EnumVehicleCategory.MODEL_BOAT, "TITANIC", 48));
    }

    public static void seedPeople(HashMap<String, People> list) {
        PeopleDAO peopleDAO = new PeopleDAO();
        peopleDAO.insert(list, "F0001", new Employee("01010101", "Yuri Ada Tech", "F0001", "0001"));
        peopleDAO.insert(list, "015015", new Customer("015015", "Miguel Ada Tech", "1111"));
        peopleDAO.insert(list, "F0002", new Employee("02020202", "Railson Lover", "F0002", "0002"));
        peopleDAO.insert(list, "016016", new Customer("016016", "Brunoid Atrasadao", "2222"));
    }

    public static void seedPayment(HashMap<String, Payment> list) {
        PaymentDAO paymentDAO = new PaymentDAO();
        paymentDAO.insert(list, "1111111111", new CreditCard("1111111111", EnumCreditCardFlag.FLAG_MASTERCARD, "12/28", "111", "Yuri Ada Tech"));
        paymentDAO.insert(list, "2222222222", new CreditCard("2222222222", EnumCreditCardFlag.FLAG_ALELO, "12/28", "222" , "Miguel Ada Tech"));
        paymentDAO.insert(list, "3333333333", new PicPay("Miguel Ada Tech"));
        paymentDAO.insert(list, "4444444444", new PicPay("Yuri Ada Tech"));
    }
}
