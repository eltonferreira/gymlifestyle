package com.gym.gymlifestyle.services;

import com.gym.gymlifestyle.entities.User;
import com.gym.gymlifestyle.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService extends GenericService<User, UUID, UserRepository> {
}
