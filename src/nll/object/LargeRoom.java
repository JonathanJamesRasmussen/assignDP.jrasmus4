package nll.object;
/**
 * 
 * @author Jonathan Rasmussen
 * @version 1.0
 * @since 1.0
 *
 */
public class LargeRoom implements Room {
    
    int food;
     
    public int limit() {
        return 50;
    }
    
    public int food(int totalFood) {
        food = totalFood/2;
        return food;
    }
    
    public void subtractFood() {
        food -= 1;
    }
    
    public boolean isNull() {
        return false;
    }
    
    public void text() {
        System.out.println("I'm a large room!");
    }
}
