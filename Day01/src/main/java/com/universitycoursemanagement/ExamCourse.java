package com.universitycoursemanagement;

public class ExamCourse extends CourseType{
    public ExamCourse(){
        super("Exam based Course");
    }
    public String getEvaluationMethod(){
        return "Evaluation via final exams";
    }
}