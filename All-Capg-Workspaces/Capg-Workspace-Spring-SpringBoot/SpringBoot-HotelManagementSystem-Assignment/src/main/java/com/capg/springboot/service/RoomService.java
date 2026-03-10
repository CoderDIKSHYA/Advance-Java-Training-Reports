package com.capg.springboot.service;

import java.util.List;
import com.capg.springboot.entity.Room;

public interface RoomService {

    Room addRoom(Room room);

    List<Room> getAllRooms();

    Room getRoomById(Long id);

    Room updateRoom(Long id, Room room);

    void deleteRoom(Long id);
}