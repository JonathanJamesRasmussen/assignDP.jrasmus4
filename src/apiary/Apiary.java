package apiary;

/**
 * 
 * @author Jonathan Rasmussen
 * @version 1.0
 * @since 1.0
 *
 */
import beehive.Beehive;


public class Apiary {
    private static Apiary single_instance = null;
    
    private Apiary() {
        //TODO create hives
        System.out.println("Test");
    }
    
    public static Apiary getInstance() {
        if (single_instance == null) {
            single_instance = new Apiary();
            
            return single_instance;
            
        } else {
            return null;
        }
    }
}
