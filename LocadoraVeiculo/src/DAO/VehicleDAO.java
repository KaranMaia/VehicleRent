package DAO;

import java.util.HashMap;

import Model.Vehicle.*;

public class VehicleDAO extends BaseDAO<String, Vehicle> {

    @Override
    public HashMap<String, Vehicle> getAll(HashMap<String, Vehicle> list) {
        System.out.println("Lista de veículos:");
        for(Vehicle object : list.values()) {
            System.out.println(object);
        }

        return list;
    }

    @Override
    public Vehicle getById(HashMap<String, Vehicle> list, String id) {
        Vehicle object = list.get(id);
        System.out.println(object);
        
        return object;
    }
    
}
