package com.example.dorossy.Models;

public class SubjectsModel {

    private String subjectName;
    private int imgId;

    public SubjectsModel(String subjectName, int imgId){
        this.subjectName = subjectName;
        this.imgId = imgId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
