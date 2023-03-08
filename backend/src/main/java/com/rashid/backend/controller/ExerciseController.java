package com.rashid.backend.controller;

import com.rashid.backend.Exercise;
import com.rashid.backend.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {
    @Autowired
    private ExerciseRepository exRepo;

    @GetMapping
    public List<Exercise> getExercises() {
        return exRepo.findAll();
    }
}
