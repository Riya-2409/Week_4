package com.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public List<Course<? extends CourseType>> getCourses() {
        return courses;
    }

    public void displayCourses() {
        System.out.println("\nUniversity Course Catalog:");
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }
}