package nll.object;

public class SmallRoom  implements Room {
 int food;
    
    public int limit() {
        return 10;
    }
    
    public int food(int totalFood) {
        food = totalFood/8;
        return food;
    }
    
    public void subtractFood() {
        food -= 1;
    }
    
    public boolean isNull() {
        return false;
    }
    
    public void text() {
        System.out.println("I'm a small room");
    }
}

