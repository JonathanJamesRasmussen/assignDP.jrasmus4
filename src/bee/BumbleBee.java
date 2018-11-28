package bee;
/**
 * 
 * @author Jonathan Rasmussen
 * @version 1.0
 * @since 1.0
 */
public class BumbleBee extends BeeDecorator{
    
    int power = 2;
    int consumption = 1;
    int collection = 1;
    
    public BumbleBee(Bee bee) {
        super(bee);
    }
    
    @Override
    public void battle(Bee opponent) {
        super.battle(opponent);
    }
    
    @Override
    public void rest() {
        super.rest();
    }
    
    @Override
    public void harvest() {
        super.harvest();
    }
    
    @Override
    public void perish() {
        super.perish();
    }
}