package AbstractDesingPattern;

public class WebDeveloper implements Employee {


    @Override
    public int Salary() {
        return 79000;
    }

    public String name(){
        System.out.println("Im Web Developer");
        return "WEB-DEVELOPER";
    }
}
