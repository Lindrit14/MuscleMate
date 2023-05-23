package com.fhcampuswien.MuscleMate.service;

import com.fhcampuswien.MuscleMate.model.Exercise;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    //example of an exercise
    public List<Exercise> getExercise() {
        return List.of(
                new Exercise(1, "Incline Hammer Curls", "biceps", "strength", "beginner", 0),
                new Exercise(2, "Squats", "quadriceps", "strength", "intermediate", 0),
                new Exercise(3, "Push-ups", "chest", "strength", "beginner", 0),
                new Exercise(4, "Plank", "core", "endurance", "beginner", 0),
                new Exercise(5, "Deadlifts", "hamstrings", "strength", "advanced", 0),
                new Exercise(6, "Shoulder Press", "shoulders", "strength", "intermediate", 0),
                new Exercise(7, "Lunges", "glutes", "strength", "beginner", 0),
                new Exercise(8, "Crunches", "abs", "endurance", "beginner", 0),
                new Exercise(9, "Bench Press", "chest", "strength", "intermediate", 0),
                new Exercise(10, "Pull-ups", "back", "strength", "advanced", 0)
        );
    }
}
