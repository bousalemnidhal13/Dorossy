package com.example.dorossy.Models;

public class Division {

    private String id;
    private String divisionName;

    public Division(String id, String divisionName) {
        this.id = id;
        this.divisionName = divisionName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }
}
