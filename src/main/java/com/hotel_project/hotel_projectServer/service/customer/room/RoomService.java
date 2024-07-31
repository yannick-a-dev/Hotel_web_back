package com.hotel_project.hotel_projectServer.service.customer.room;

import com.hotel_project.hotel_projectServer.dto.RoomResponseDto;

public interface RoomService {
    RoomResponseDto getAllAvailableRoom(int pageNumber);
}
