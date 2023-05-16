package com.example.dorossy.Models;

public class Grade {

    String id;
    String gradeName;

    public Grade(String id, String gradeName) {
        this.id = id;
        this.gradeName = gradeName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
}
