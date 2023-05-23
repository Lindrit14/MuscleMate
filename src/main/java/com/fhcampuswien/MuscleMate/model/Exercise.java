package com.fhcampuswien.MuscleMate.model;

//import jakarta.persistence.*;

import java.util.Objects;
public class Exercise {


    private Integer id;

    private String name;

    private String type;

    private String muscle;
    private String equipment;
    private String difficulty;

    private String instructions;


    //Constructors
    public Exercise(Integer id, String name, String type, String muscle, String difficulty, String equipment, String instructions ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.muscle = muscle;
        this.equipment = equipment;
        this.difficulty = difficulty;
        this.instructions = instructions;
    }

    public Exercise() {
    }

    //Getters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getMuscle() {
        return muscle;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getInstructions() {
        return instructions;
    }

    //Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return Objects.equals(id, exercise.id) && Objects.equals(name, exercise.name) && Objects.equals(type, exercise.type) && Objects.equals(muscle, exercise.muscle) && Objects.equals(equipment, exercise.equipment) && Objects.equals(difficulty, exercise.difficulty) && Objects.equals(instructions, exercise.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, muscle, equipment, difficulty, instructions);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", muscle='" + muscle + '\'' +
                ", equipment='" + equipment + '\'' +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }
}
