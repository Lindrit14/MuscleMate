package com.fhcampuswien.MuscleMate.service;

import com.fhcampuswien.MuscleMate.model.Exercise;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    //example of an exercise
    public List<Exercise> getExercise(){
        return List.of(
                new Exercise(
                        1,
                        "Incline Hammer Curls",
                        "biceps",
                        "strength",
                        "beginner",
                        0
                )
        );
    }
}
