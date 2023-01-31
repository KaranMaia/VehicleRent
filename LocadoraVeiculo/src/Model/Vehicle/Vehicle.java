package Model.Vehicle;

import Enum.EnumVehicleCategory;
import Enum.EnumVehicleStatus;

public abstract class Vehicle {

    private String vehiclePlate;
    private EnumVehicleCategory vehicleCategory;
    private String vehicleModel;
    private float vehicleFuelTank;
    private float vehicleRentalPrice;
    private EnumVehicleStatus vehicleStatus;

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public EnumVehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(EnumVehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public float getVehicleFuelTank() {
        return vehicleFuelTank;
    }

    public void setVehicleFuelTank(float vehicleFuelTank) {
        this.vehicleFuelTank = vehicleFuelTank;
    }

    public float getVehicleRentalPrice() {
        return vehicleRentalPrice;
    }

    public void setVehicleRentalPrice(float vehicleRentalPrice) {
        this.vehicleRentalPrice = vehicleRentalPrice;
    }

    public EnumVehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(EnumVehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public float getPriceOnCategory(EnumVehicleCategory model) {
        switch (model) {
            case MODEL_SEDAN:
                return 200;
            case MODEL_COUPE:
                return 100;
            case MODEL_SPORT:
                return 700;
            case MODEL_SUV:
                return 400;
            case MODEL_BICYCLE:
                return 0;
            case MODEL_BOAT:
                return 300;
            case MODEL_MOTORCYCLE:
                return 150;
            default:
                return 1000;
        }
    }

    public float getPriceOnFuel(float vehicleFuelTank) {
        if (vehicleFuelTank >= 70) {
            return 1;
        } else {
            return 75;
        }
    }

}
