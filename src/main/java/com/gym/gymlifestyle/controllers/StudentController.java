package com.gym.gymlifestyle.controllers;

import com.gym.gymlifestyle.dtos.requests.StudentRequestDTO;
import com.gym.gymlifestyle.dtos.responses.StudentResponseDTO;
import com.gym.gymlifestyle.entities.Student;
import com.gym.gymlifestyle.services.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController extends GenericController<Student, UUID, StudentRequestDTO,
        StudentResponseDTO, StudentService> {
}
