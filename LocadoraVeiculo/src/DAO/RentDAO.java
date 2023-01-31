package DAO;

import java.util.HashMap;

import Model.Rent.Rent;

public class RentDAO extends BaseDAO<String, Rent> {

    @Override
    public HashMap<String, Rent> getAll(HashMap<String, Rent> list) {
        System.out.println("Lista de alugueis: ");
        for(Rent object : list.values()) {
            System.out.println(object);
        }
        return list;
    }

    @Override
    public Rent getById(HashMap<String, Rent> list, String id) {
        Rent object = list.get(id);
        System.out.println(object);
        return object;
    }
    
}
