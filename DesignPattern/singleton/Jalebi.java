package singleton;

public class Jalebi {

    //Eager way of crete  singleton object
    private static Jalebi jalebi = new Jalebi();

    public static  Jalebi getJalebi(){
        return jalebi;
    }
}
