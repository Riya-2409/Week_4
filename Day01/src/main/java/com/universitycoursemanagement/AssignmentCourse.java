package com.universitycoursemanagement;

public class AssignmentCourse extends CourseType{
    public AssignmentCourse(){
        super("Assignment Course");
    }
    public String getEvaluationMethod(){
        return "Evaluation via periodic assignment";
    }
}