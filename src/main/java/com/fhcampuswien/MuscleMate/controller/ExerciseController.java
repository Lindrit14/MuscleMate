package com.fhcampuswien.MuscleMate.controller;

import com.fhcampuswien.MuscleMate.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/exercise")
public class ExerciseController {

    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService exerciseService){
        this.exerciseService = exerciseService;
    }

    @GetMapping("/get-all-exercises")
    public ResponseEntity<?> getAllExercises() {
        return ResponseEntity.ok(exerciseService.getAllExercises());
    }

    @GetMapping("/get-all-body-parts")
    public ResponseEntity<?> getAllBodyParts(){
        return ResponseEntity.ok(exerciseService.getAllBodyParts());
    }

    @GetMapping("/get-all-muscles")
    public ResponseEntity<?> getAllMuscles(){
        return ResponseEntity.ok(exerciseService.getAllMuscles());
    }

    @GetMapping("/get-all-equipment")
    public ResponseEntity<?> getAllEquipment(){
        return ResponseEntity.ok(exerciseService.getAllEquipment());
    }


    @GetMapping("/muscle/{targetMuscle}")
    public ResponseEntity<?> getExerciseByMuscle(@PathVariable("targetMuscle") String targetMuscle){
        return ResponseEntity.ok(exerciseService.getExerciseByMuscle(targetMuscle));
    }

    @GetMapping("/bodyPart/{targetBodyPart}")
    public ResponseEntity<?> getExerciseByBodyPart(@PathVariable("targetBodyPart") String targetBodyPart){
        return ResponseEntity.ok(exerciseService.getExerciseByBodyPart(targetBodyPart));
    }

    @GetMapping("/exercise/{id}")
    public ResponseEntity<?> getExerciseByID(@PathVariable("id") String id){
        return ResponseEntity.ok(exerciseService.getExerciseByID(id));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<?> getExerciseByName(@PathVariable("name") String name){
        return ResponseEntity.ok(exerciseService.getExerciseByName(name));
    }

    @GetMapping("/equipment/{equipment}")
    public ResponseEntity<?> getExerciseByEquipment(@PathVariable("equipment") String equipment){
        return ResponseEntity.ok(exerciseService.getExerciseByEquipment(equipment));
    }

}
