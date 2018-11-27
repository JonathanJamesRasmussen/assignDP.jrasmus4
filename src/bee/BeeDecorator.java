package bee;

/**
 * 
 * @author Jonathan Rasmussen
 * @version 1.0
 * @since 1.0
 *
 */
public class BeeDecorator implements Bee {
    
    protected Bee decoratedBee;
    
    public BeeDecorator(Bee decoratedBee) {
        this.decoratedBee = decoratedBee;
    }
    
    public void battle() {
        decoratedBee.battle();
    }
    
    public void rest() {
        decoratedBee.rest();
    }
    
    public void harvest() {
        decoratedBee.harvest();
    }
}
