package singleton;

/*
    public  enum Samosa {
        INSTANCE;


    }
    */


import java.io.Serializable;

public class Samosa implements Serializable, Cloneable {

   private static  Samosa samosa;
    // constructor
    private Samosa() {
        /*if(samosa != null){
            throw new RuntimeException("can't access the object, it is singleton pattern !!");
        }*/
    }      

    // Lazy way to creating singleton object
    // problem - it is not thread safety

   /*
    public synchronized static Samosa getSamose(){

        // create the object of class
        if(samosa==null){
            samosa = new Samosa();
        }
        return samosa;
    }
    */

    //thread safety Lazy way to creating singleton object
    // Method synchronized
   /*
    public synchronized static Samosa getSamose(){
        // create the object of class
        if(samosa==null){
            samosa = new Samosa();
        }
        return samosa;
    }
    */
        // thread safety synchronized block

    public synchronized static Samosa getSamose(){
        // create the object of class
        if(samosa==null){
            synchronized (Samosa.class){
                if(samosa == null){
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }

    public Object readResolve(){
        return samosa;
    }

    @Override
    public Object clone(){
        return samosa;
    }

}



/*
 * cosntructor should be private
 * object create with the help of methods
 * create fields to store object in private
 */
