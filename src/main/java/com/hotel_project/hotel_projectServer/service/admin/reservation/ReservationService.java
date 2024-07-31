package com.hotel_project.hotel_projectServer.service.admin.reservation;

import com.hotel_project.hotel_projectServer.dto.ReservationResponseDto;

public interface ReservationService {
    ReservationResponseDto getAllReservations(int pageNumber);

    boolean changeReservationStatus(Long id, String status);
}
