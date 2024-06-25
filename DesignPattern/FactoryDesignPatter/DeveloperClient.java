package FactoryDesignPatter;

public class DeveloperClient  {

    public static void main(String[] args){

        Employee webDeveloper = EmployeeFactory.getEmployee("Web Developer");
        int salary = webDeveloper.salary();
        System.out.println("Salary: "+ salary);

        Employee anderiodDeveloper = EmployeeFactory.getEmployee("Anderiod Developer");
        int salary1 = anderiodDeveloper.salary();
        System.out.println("Salary: "+ salary1);
    }
}
