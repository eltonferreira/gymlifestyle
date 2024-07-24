package com.gym.gymlifestyle.controllers;

import com.gym.gymlifestyle.dtos.requests.UserRequestDTO;
import com.gym.gymlifestyle.dtos.responses.UserResponseDTO;
import com.gym.gymlifestyle.entities.User;
import com.gym.gymlifestyle.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("users")
public class UserController extends GenericController<User, UUID, UserRequestDTO, UserResponseDTO, UserService> {
}
