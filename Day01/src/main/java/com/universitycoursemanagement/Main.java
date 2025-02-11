package com.universitycoursemanagement;

public class Main {

    public static void main(String[] args) {
        ExamCourse examCourse = new ExamCourse();
        AssignmentCourse assignmentCourse = new AssignmentCourse();
        ResearchCourse researchCourse = new ResearchCourse();

        Course<ExamCourse> mathCourse = new Course<>("Mathematics 101", examCourse);
        Course<AssignmentCourse> csCourse = new Course<>("Data Structures", assignmentCourse);
        Course<ResearchCourse> aiCourse = new Course<>("Artificial Intelligence Research", researchCourse);


        CourseCatalog catalog = new CourseCatalog();
        catalog.addCourse(mathCourse);
        catalog.addCourse(csCourse);
        catalog.addCourse(aiCourse);

        catalog.displayCourses();
    }
}
