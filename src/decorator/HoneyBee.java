package decorator;
/**
 * 
 * @author Jonathan Rasmussen
 * @version 1.0
 * @since 1.0
 */
public class HoneyBee extends BeeDecorator{
    
    int power = 1;
    int consumption = 1;
    int collection = 2;
    
    public HoneyBee(Bee bee) {
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
    
    @Override
    public void talk() {
        super.talk();
        System.out.println("I'm a Honey Bee!");
    }
}
