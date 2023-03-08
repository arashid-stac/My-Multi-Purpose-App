package com.rashid.backend;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Objects;

@Entity
@Table(name = "exercises")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String exName;
    private ArrayList<String> muscleGroup = new ArrayList<String>();

    public Exercise(String exName, ArrayList<String> muscleGroup) {
        this.exName = exName;
        this.muscleGroup = muscleGroup;
    }

    public Exercise() {

    }
    public String getExName() {
        return exName;
    }

    public void setExName(String exName) {
        this.exName = exName;
    }

    public ArrayList<String> getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(ArrayList<String> muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return Objects.equals(id, exercise.id) && Objects.equals(exName, exercise.exName) && Objects.equals(muscleGroup, exercise.muscleGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, exName, muscleGroup);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", exName='" + exName + '\'' +
                ", muscleGroup=" + muscleGroup +
                '}';
    }
}
