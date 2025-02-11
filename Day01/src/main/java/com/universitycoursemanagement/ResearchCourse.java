package com.universitycoursemanagement;

public class ResearchCourse extends CourseType{
    public ResearchCourse(){
        super("Research based Course");
    }
    public String getEvaluationMethod(){
        return "Evaluation via research projects";
    }
}