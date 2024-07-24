package com.gym.gymlifestyle.services;

import com.gym.gymlifestyle.entities.WorkoutPlan;
import com.gym.gymlifestyle.repositories.WorkoutPlanRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WorkoutPlanService extends GenericService<WorkoutPlan, UUID, WorkoutPlanRepository> {
}
