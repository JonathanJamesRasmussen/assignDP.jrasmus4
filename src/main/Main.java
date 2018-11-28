package main;
/**
*@author Jonathan Rasmussen
*@version 1.0
*@since 1.0
*/

import singleton.Apiary;
import decorator.Bee;
import decorator.BumbleBee;
import decorator.KillerBee;
import decorator.BasicBee;
import decorator.HoneyBee;
import nll.object.*;

public class Main {
    public static void main(String[] args) {
        Apiary myApiary = Apiary.getInstance();
        
        Bee honeyBee = new HoneyBee(new BasicBee());
        honeyBee.talk();
        
        Room room = RoomFactory.createRoom("Large");
        room.text();
    }
}