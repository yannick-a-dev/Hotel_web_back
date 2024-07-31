package com.hotel_project.hotel_projectServer.repository;

import com.hotel_project.hotel_projectServer.entities.Reservation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Page<Reservation> findAllByUserId(Pageable pageable, Long userId);
}
