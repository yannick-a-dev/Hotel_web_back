package com.hotel_project.hotel_projectServer.dto;

import com.hotel_project.hotel_projectServer.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {
    private String jwt;
    private Long userId;
    private UserRole userRole;
}
