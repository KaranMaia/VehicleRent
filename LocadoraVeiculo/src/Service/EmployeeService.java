package Service;

import java.util.HashMap;

import DAO.EmployeeDAO;
import Model.People.Employee;
import Model.People.People;

public class EmployeeService {

    static EmployeeDAO employeeDAO = new EmployeeDAO();

    public static HashMap<String, People> getEmployees(HashMap<String, People> list) {
        return employeeDAO.getAll(list);
    }

    public static Employee getEmployeeById(HashMap<String, People> list, String id) {
        return employeeDAO.getById(list, id);
    }

    public static Employee checkEmployee(HashMap<String, People> list, String id) throws Exception {
        Employee employee = EmployeeService.getEmployeeById(list, id);
        if(employee.equals(null)) {
            throw new Exception("Funcionário não existe");
        } else {
            return employee;
        }
    }
}
