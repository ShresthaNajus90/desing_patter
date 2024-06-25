package AbstractDesingPattern;

public class webDevelper  extends  EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
