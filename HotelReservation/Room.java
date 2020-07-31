package hotelreservation;

public class Room {
private int RoomNo;

public Room(){
    ++RoomNo;
}

public int getRoom(){
    return RoomNo;
}
}
