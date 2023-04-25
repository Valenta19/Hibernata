public class Application {
    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee = new Employee("Ivan", "Stokes", "male", 27, 4);
       employeeDAO.getEmployeeById(2);
        employeeDAO.getAllEmployee();
        employeeDAO.createEmployee(employee);
        employeeDAO.deleteEmployee(employee);

        employeeDAO.getAllEmployee();
        employee.setAge(20);
        employeeDAO.updateEmployee(employee);
        employeeDAO.getAllEmployee();



    }
}

