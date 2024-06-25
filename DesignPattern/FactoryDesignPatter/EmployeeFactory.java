package FactoryDesignPatter;

public class EmployeeFactory {

    // get the emaployee

    public static Employee getEmployee(String empType){
        if(empType.trim().equals("Anderiod Developer")){
            return new AnderiodDeveloper();
        } else
            if(empType.trim().equals("Web Developer")){
                return new WebDeveloper();
            } else
            {
                return null;
            }
    }
}
