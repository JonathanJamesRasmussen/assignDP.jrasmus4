package decorator;

/**
 * 
 * @author Jonathan Rasmsusen
 * @version 1.0
 * @since 1.0
 */

public interface Bee {
    
    
    int power = 0;
    int consumption = 0;
    int collection = 0;
    void battle(Bee opponent);
    void rest();
    void harvest();
    void perish();
    void talk();
    
}
