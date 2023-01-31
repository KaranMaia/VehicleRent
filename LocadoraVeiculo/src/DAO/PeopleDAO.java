package DAO;

import java.util.HashMap;

import Model.People.People;

public class PeopleDAO extends BaseDAO<String, People> {

    @Override
    public HashMap<String, People> getAll(HashMap<String, People> list) {
        System.out.println("Lista de pessoas: ");
        for(People object : list.values()) {
            System.out.println(object);
        }

        return list;
    }

    @Override
    public People getById(HashMap<String, People> list, String id) {
        People object = list.get(id);
        System.out.println(object);

        return object;
    }
    
}
