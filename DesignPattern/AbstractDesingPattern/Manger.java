package AbstractDesingPattern;

public class Manger implements Employee {
    @Override
    public int Salary() {
        return 120000;
    }

    @Override
    public String name() {
        System.out.println("Im Manager");
        return "MANAGER";
    }
}
