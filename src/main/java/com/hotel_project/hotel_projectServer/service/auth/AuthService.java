package com.hotel_project.hotel_projectServer.service.auth;

import com.hotel_project.hotel_projectServer.dto.SignupRequest;
import com.hotel_project.hotel_projectServer.dto.UserDto;

public interface AuthService {
    UserDto createUser(SignupRequest signupRequest);
}
