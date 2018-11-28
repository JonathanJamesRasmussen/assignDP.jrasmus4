package nll.object;
/**
 * @author Jonathan Rasmussen
 * @version 1.0
 * @since 1.0
 */
public class NullRoom implements Room {
    int food;
    
    public int limit() {
        return 0;
    }
    
    public int food(int totalFood) {
        return 0;
    }
    
    public void subtractFood() {
    }
    
    public boolean isNull() {
        return true;
    }
    
    public void text() {
        System.out.println("I'm a null room");
    }
}
