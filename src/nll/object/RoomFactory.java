package nll.object;

public class RoomFactory {
    public static Room createRoom(String roomType) {
        Room room = null;
        if ("Large".equalsIgnoreCase(roomType)) {
            room = new LargeRoom();
        } else if ("Medium".equalsIgnoreCase(roomType)) {
            room = new MediumRoom();
        } else if ("Small".equalsIgnoreCase(roomType)) {
            room = new SmallRoom();
        } else {
            room = new NullRoom();
        }
        return room;
    }
}
