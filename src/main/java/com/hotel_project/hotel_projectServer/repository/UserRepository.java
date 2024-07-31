package com.hotel_project.hotel_projectServer.repository;

import com.hotel_project.hotel_projectServer.entities.User;
import com.hotel_project.hotel_projectServer.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findFirstByEmail(String email);

  Optional<User> findByUserRole(UserRole userRole);
}
