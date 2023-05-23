package com.fhcampuswien.MuscleMate.model;

//import jakarta.persistence.*;

import java.util.Objects;
public class Exercise {


    private Integer id;

    private String name;

    private String type;

    private String muscle;

    private String difficulty;

    private Integer offset;


    //Constructors
    public Exercise(Integer id, String name, String type, String muscle, String difficulty, Integer offset) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.muscle = muscle;
        this.difficulty = difficulty;
        this.offset = offset;
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

    public Integer getOffset() {
        return offset;
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

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return Objects.equals(id, exercise.id) && Objects.equals(name, exercise.name) && Objects.equals(type, exercise.type) && Objects.equals(muscle, exercise.muscle) && Objects.equals(difficulty, exercise.difficulty) && Objects.equals(offset, exercise.offset);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, muscle, difficulty, offset);
    }


    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", muscle='" + muscle + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", offset=" + offset +
                '}';
    }
}
