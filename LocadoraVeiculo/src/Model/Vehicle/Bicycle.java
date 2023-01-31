package Model.Vehicle;

import java.text.DecimalFormat;

import Enum.EnumVehicleCategory;
import Enum.EnumVehicleStatus;
import Service.VehicleService;

public class Bicycle extends Vehicle {

    @Override
    public String toString() {
        String model = this.getVehicleModel();
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        float price = this.getVehicleRentalPrice();
        String newPrice = df.format(price);
        String plate = this.getVehiclePlate();
        String phrase = "Destacando a bicicleta de modelo " + model + " por apenas R$" + newPrice + ". Serial: " + plate;
        return phrase;
    }

    public Bicycle(String vehiclePlate, EnumVehicleCategory vehicleCategory, String vehicleModel, float vehicleFuelTank) {
        this.setVehicleModel(vehicleModel);
        this.setVehicleCategory(vehicleCategory);
        this.setVehicleFuelTank(vehicleFuelTank);
        this.setVehiclePlate(vehiclePlate);
        this.setVehicleRentalPrice(0);
        this.setVehicleStatus(EnumVehicleStatus.STATUS_AVAILABLE);
        VehicleService.calculateRentalPrice(this);
    }

}
