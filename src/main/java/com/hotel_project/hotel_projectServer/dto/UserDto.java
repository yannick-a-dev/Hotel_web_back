package com.hotel_project.hotel_projectServer.dto;

import com.hotel_project.hotel_projectServer.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private UserRole userRole;
}
