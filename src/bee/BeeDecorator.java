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
    protected int food;
    protected int power;
    protected int consumption;
    protected int collection;
    
    public BeeDecorator(Bee decoratedBee) {
        super();
        this.decoratedBee = decoratedBee;
    }
    
    public void battle(Bee opponent) {
        this.decoratedBee.battle(opponent);
    }
    
    public void rest() {
        this.decoratedBee.rest();
    }
    
    public void harvest() {
        this.decoratedBee.harvest();
    }
    
    public void perish() {
        this.decoratedBee.perish();
    }
}
