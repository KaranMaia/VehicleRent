package DAO;

import java.util.HashMap;

import Model.People.Employee;
import Model.People.People;

public class EmployeeDAO extends PeopleDAO {

    @Override
    public HashMap<String, People> getAll(HashMap<String, People> list) {
        System.out.println("Lista de funcionários: ");
        for(Object object : list.values()) {
            if(object.getClass().equals(Employee.class))
                System.out.println(object);
        }

        return list;
    }

    @Override
    public Employee getById(HashMap<String, People> list, String id) {
        Object object = list.get(id);
        if(object.getClass().equals(Employee.class)) {
                System.out.println(object);
        } else {
            System.out.println("Não é funcionário");
        }

        return (Employee) object;

    }

}
