package com.gym.gymlifestyle.services;

import com.gym.gymlifestyle.entities.Role;
import com.gym.gymlifestyle.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RoleService extends GenericService<Role, UUID, RoleRepository> {
}
