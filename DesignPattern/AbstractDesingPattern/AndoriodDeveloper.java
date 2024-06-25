package AbstractDesingPattern;

public class AndoriodDeveloper extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper() ;
    }
}
