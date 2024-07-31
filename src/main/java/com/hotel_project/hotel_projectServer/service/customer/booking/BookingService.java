package com.hotel_project.hotel_projectServer.service.customer.booking;

import com.hotel_project.hotel_projectServer.dto.ReservationDto;
import com.hotel_project.hotel_projectServer.dto.ReservationResponseDto;

public interface BookingService {
    boolean postReservation(ReservationDto reservationDto);

    ReservationResponseDto getAllReservationByUserId(Long userId, int pageNumber);
}
