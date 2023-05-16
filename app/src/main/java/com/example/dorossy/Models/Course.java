package com.example.dorossy.Models;

public class Course {

    private String id;
    private String courseName;

    public Course(String id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
