package nll.object;

public class MediumRoom implements Room {
 int food;
    
    public int limit() {
        return 25;
    }
    
    public int food(int totalFood) {
        food = totalFood/4;
        return food;
    }
    
    public void subtractFood() {
        food -= 1;
    }
    
    public boolean isNull() {
        return false;
    }
    
    public void text() {
        System.out.println("I'm a medium room!");
    }
}
