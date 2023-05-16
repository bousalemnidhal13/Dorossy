package com.example.dorossy.Models;

public class Exercice {

    private String id;
    private String exerciceName;

    public Exercice(String id, String exerciceName) {
        this.id = id;
        this.exerciceName = exerciceName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExerciceName() {
        return exerciceName;
    }

    public void setExerciceName(String exerciceName) {
        this.exerciceName = exerciceName;
    }
}
