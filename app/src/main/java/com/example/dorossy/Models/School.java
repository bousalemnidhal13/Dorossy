package com.example.dorossy.Models;

public class School {

    private String id;
    private String SchoolName;
    private String SchoolType;

    public School(String id, String schoolName, String schoolType) {
        this.id = id;
        SchoolName = schoolName;
        SchoolType = schoolType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public String getSchoolType() {
        return SchoolType;
    }

    public void setSchoolType(String schoolType) {
        SchoolType = schoolType;
    }
}
