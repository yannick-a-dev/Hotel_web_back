package com.hotel_project.hotel_projectServer.service.admin.room;

import com.hotel_project.hotel_projectServer.dto.RoomDto;
import com.hotel_project.hotel_projectServer.dto.RoomResponseDto;

public interface RoomService {
    boolean postRoom(RoomDto roomDto);
    RoomResponseDto getAllRooms(int pageNumber);
    RoomDto getRoomById(Long id);
    boolean updateRoom(Long id, RoomDto roomDto);
    void deleteRoom(Long id);
}
