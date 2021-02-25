package com.example.FirstAidSim;

public class Course {

    private String courseName;
    private String description;
    private int thumbnail_course;


    public Course(){

    }

    public Course(String courseName, String description, int thumbnail_course) {
        this.courseName = courseName;
        this.description = description;
        this.thumbnail_course = thumbnail_course;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThumbnail_course() {
        return thumbnail_course;
    }

    public void setThumbnail_course(int thumbnail_course) {
        this.thumbnail_course = thumbnail_course;
    }
}
