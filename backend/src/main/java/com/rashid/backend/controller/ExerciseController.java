package com.rashid.backend.controller;

import com.rashid.backend.Exercise;
import com.rashid.backend.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {
    @Autowired
    private ExerciseRepository exRepo;

    public ExerciseController(ExerciseRepository exRepo) {
        this.exRepo = exRepo;
    }

    @GetMapping
    public List<Exercise> getExercises() {
        return exRepo.findAll();
    }

    record NewExerciseRequest(
            String exName,
            ArrayList<String> muscleGroup
    ) {

    }

    @PostMapping
    public void addExercise(@RequestBody NewExerciseRequest request) {
        Exercise exercise = new Exercise();
        exercise.setExName(request.exName);
        exercise.setMuscleGroup(request.muscleGroup);
        exRepo.save(exercise);
    }

}
