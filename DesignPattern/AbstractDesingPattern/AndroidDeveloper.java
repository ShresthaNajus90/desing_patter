package AbstractDesingPattern;



public class AndroidDeveloper implements Employee {


    @Override
    public int Salary() {
        return 90000;
    }

    public String name(){
        System.out.println("Im AndroidDeveloper ");
        return "Android-Developer";


    }
}
