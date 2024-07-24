package com.gym.gymlifestyle.controllers;

import com.gym.gymlifestyle.dtos.requests.RoleRequestDTO;
import com.gym.gymlifestyle.dtos.responses.RoleResponseDTO;
import com.gym.gymlifestyle.entities.Role;
import com.gym.gymlifestyle.services.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("roles")
public class RoleController extends GenericController<Role, UUID, RoleRequestDTO, RoleResponseDTO, RoleService> {
}
