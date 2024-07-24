package com.gym.gymlifestyle.services;

import com.gym.gymlifestyle.entities.Student;
import com.gym.gymlifestyle.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentService extends GenericService<Student, UUID, StudentRepository> {
}
