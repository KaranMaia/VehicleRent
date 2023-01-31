package Service;

import java.util.HashMap;

import DAO.VehicleDAO;
import Enum.*;
import Model.Vehicle.Vehicle;

public class VehicleService {

    static VehicleDAO vehicleDAO = new VehicleDAO();

    public static HashMap<String, Vehicle> getVehicles(HashMap<String, Vehicle> list) {
        return vehicleDAO.getAll(list);
    }

    public static Vehicle getVehicleById(HashMap<String, Vehicle> list, String id) {
        return vehicleDAO.getById(list, id);
    }

    public static void calculateRentalPrice(Vehicle vehicle) {
        EnumVehicleCategory category = vehicle.getVehicleCategory();
        float newPrice = vehicle.getPriceOnCategory(category);
        float tank = vehicle.getVehicleFuelTank();
        newPrice += vehicle.getPriceOnFuel(tank);
        vehicle.setVehicleRentalPrice(newPrice);
    }

    public static Vehicle checkAvailability(String vehicleId, HashMap<String, Vehicle> vehicleList) throws Exception {
        Vehicle vehicle = VehicleService.getVehicleById(vehicleList, vehicleId);
        if(!vehicle.getVehicleStatus().equals(EnumVehicleStatus.STATUS_AVAILABLE) || vehicle.equals(null)){
            throw new Exception("Veículo indisponível");
        } else {
            return vehicle;
        }
    }

}
