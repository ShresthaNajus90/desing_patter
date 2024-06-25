package AbstractDesingPattern;

public class ManagerFactory  extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Manger();
    }
}
