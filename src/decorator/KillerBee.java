package decorator;
/**
 * 
 * @author Jonathan Rasmussen
 * @version 1.0
 * @since 1.0
 */
public class KillerBee extends BeeDecorator{
    
    int power = 3;
    int consumption = 2;
    int collection = 1;
    
    public KillerBee(Bee bee) {
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