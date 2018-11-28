package bee;

/**
 * 
 * @author Jonathan Rasmussen
 * @version 1.0
 * @since 1.0
 */
public class BasicBee implements Bee {
    int food;
    int power = 1;
    int consumption = 1;
    int collection = 1;
    
    public void battle(Bee opponent) {
        if (opponent.power >= this.power) {
            perish();
        } else {
            if (opponent.consumption < this.consumption) {
                this.consumption = opponent.consumption;
            }
            if (opponent.collection > this.collection) {
                this.collection = opponent.collection;
            }
        }
    }
    
    public void rest() {
        food -= consumption;
    }
    
    public void harvest() {
        food += collection;
    }
    
    public void perish() {
        power = 0;
        consumption = 0;
        collection = 0;
    }
}
