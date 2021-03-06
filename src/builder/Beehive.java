package builder;

import nll.object.Room;

/**
 * 
 * @author Jonathan Rasmussen
 * @version 1.0
 * @since 1.0
 */


public class Beehive<Bee> {

    private String hiveName;
    private int startingNumBees;
    private String species;
    private int numRooms;
    private Room[] rooms = new Room[numRooms];

    public Beehive<Bee> setName(String hiveName) {
        this.hiveName = hiveName;
        return this;
    }

    public Beehive<Bee> setStartingNumBees(int startingNumBees) {
        this.startingNumBees = startingNumBees;
        return this;
    }

    public Beehive<Bee> setSpecies(String species) {
        this.species = species;
        return this;
    }

    public Beehive<Bee> setNumRooms(int numRooms) {
        this.numRooms = numRooms;
        return this;
    }

    public Beehive<Bee> setRooms(Room[] rooms) {
        this.rooms = rooms;
        return this;
    }
    
    public String getName() {
        return this.hiveName;
    }
    
    public int getNumBees() {
        return this.startingNumBees;
    }
    
    public String getSpecies() {
        return this.species;
    }
    
    public int getNumRooms() {
        return this.numRooms;
    }
    
    public Room[] getRooms() {
        return this.rooms;
    }
}
