package nll.object;
/**
 * 
 * @author Jonathan Rasmussen
 * @version 1.0
 * @since 1.0
 */
public interface Room {
    int limit();
    int food(int totalFood);
    void subtractFood();
    boolean isNull();
    void text();
}
