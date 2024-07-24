package com.gym.gymlifestyle.services;

import com.gym.gymlifestyle.entities.Coach;
import com.gym.gymlifestyle.repositories.CoachRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CoachService extends GenericService<Coach, UUID, CoachRepository> {
}
