package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Example {

  

    public static void main (String[] args) throws Exception, CloneNotSupportedException {

      /*
      Samosa samosa1= Samosa.getSamose();
        System.out.println(samosa1.hashCode());

        Samosa samosa2= Samosa.getSamose();
        System.out.println(samosa2.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());

       */

        /*
Breaking down the Singleton pattern

1> Reflection API to break
solution= if object exist => throw exception from inside constructor
use - Enum


 */
     /*   Samosa s1 = Samosa.INSTANCE;
        System.out.println(s1.hashCode());

        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa samosa = constructor.newInstance();
        System.out.println(samosa.hashCode());
        */


        // Deserialization
        // solution: implementing readResolve method
        Samosa samosa = Samosa.getSamose();
        System.out.println(samosa.hashCode());
        /*
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
                oos.writeObject(samosa);
                System.out.println("Serialization Done !!");

                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
                Samosa s2 = (Samosa) ois.readObject();
                System.out.println(s2.hashCode());
          */
        Samosa clonesamosa = (Samosa)samosa.clone();
        System.out.println(clonesamosa.hashCode());
    }
    
}


