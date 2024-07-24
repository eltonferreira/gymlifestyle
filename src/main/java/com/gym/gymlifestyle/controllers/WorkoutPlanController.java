package com.gym.gymlifestyle.controllers;

import com.gym.gymlifestyle.dtos.requests.WorkoutPlanRequestDTO;
import com.gym.gymlifestyle.dtos.responses.WorkoutPlanResponseDTO;
import com.gym.gymlifestyle.entities.WorkoutPlan;
import com.gym.gymlifestyle.services.WorkoutPlanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("workoutPlans")
public class WorkoutPlanController extends GenericController<WorkoutPlan, UUID, WorkoutPlanRequestDTO,
        WorkoutPlanResponseDTO, WorkoutPlanService> {
}
