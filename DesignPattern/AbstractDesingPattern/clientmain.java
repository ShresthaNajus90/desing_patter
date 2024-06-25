package AbstractDesingPattern;

public class clientmain {

    public static  void main(String[] args){

        Employee e1 = EmployeeFactory.getEmployee(new AndoriodDeveloper());
        e1.name();

        Employee e2 = EmployeeFactory.getEmployee(new webDevelper());
        e2.name();

        Employee employee = EmployeeFactory.getEmployee(new ManagerFactory());
        employee.name();

    }
}
