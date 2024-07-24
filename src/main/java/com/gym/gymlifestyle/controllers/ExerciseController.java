package com.gym.gymlifestyle.controllers;

import com.gym.gymlifestyle.dtos.requests.ExerciseRequestDTO;
import com.gym.gymlifestyle.dtos.responses.ExerciseResponseDTO;
import com.gym.gymlifestyle.entities.Exercise;
import com.gym.gymlifestyle.services.ExerciseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("exercises")
public class ExerciseController extends GenericController<Exercise, UUID, ExerciseRequestDTO,
        ExerciseResponseDTO, ExerciseService> {
}
