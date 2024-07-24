package com.gym.gymlifestyle.services;

import com.gym.gymlifestyle.entities.Exercise;
import com.gym.gymlifestyle.repositories.ExerciseRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ExerciseService extends GenericService<Exercise, UUID, ExerciseRepository> {
}
