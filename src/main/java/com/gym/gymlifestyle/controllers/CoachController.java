package com.gym.gymlifestyle.controllers;

import com.gym.gymlifestyle.dtos.requests.CoachRequestDTO;
import com.gym.gymlifestyle.dtos.responses.CoachResponseDTO;
import com.gym.gymlifestyle.entities.Coach;
import com.gym.gymlifestyle.services.CoachService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("coaches")
public class CoachController extends GenericController<Coach, UUID, CoachRequestDTO,
        CoachResponseDTO, CoachService> {
}
