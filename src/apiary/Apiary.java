package apiary;

/**
 * 
 * @author Jonathan Rasmussen
 * @version 1.0
 * @since 1.0
 *
 */

public class Apiary {
    private static Apiary single_instance = null;
    
    private Apiary() {
        //TODO create hives
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
