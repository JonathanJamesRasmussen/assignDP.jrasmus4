package singleton;

import builder.Beehive;
import decorator.Bee;
import decorator.HoneyBee;
import decorator.BumbleBee;
import decorator.KillerBee;


public class Apiary {
    private static Apiary single_instance = null;

    private Apiary() {
        System.out.println("Apiary");
        Beehive<HoneyBee> hive1 = new Beehive<HoneyBee>()
        .setName("Hive 1")
        .setStartingNumBees(50)
        .setSpecies("Honey Bee")
        .setNumRooms(5);
        System.out.println(hive1.getName()
                + " is the hive name, and this hive has "
                + hive1.getNumBees()
                + " bees.");
    }

    public static Apiary getInstance() {
        if (single_instance == null) {
            single_instance = new Apiary();

            return single_instance;

        } else {
            return null;
        }
    }
}
