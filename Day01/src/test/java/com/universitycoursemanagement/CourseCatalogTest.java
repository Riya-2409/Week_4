package com.universitycoursemanagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class CourseCatalogTest {
    private CourseCatalog catalog;
    private ExamCourse examCourse;
    private AssignmentCourse assignmentCourse;
    private ResearchCourse researchCourse;

    @BeforeEach
    void setUp() {
        catalog = new CourseCatalog();
        examCourse = new ExamCourse();
        assignmentCourse = new AssignmentCourse();
        researchCourse = new ResearchCourse();
    }

    @Test
    void testAddAndRetrieveCourses() {
        Course<ExamCourse> mathCourse = new Course<>("Mathematics 101", examCourse);
        Course<AssignmentCourse> csCourse = new Course<>("Data Structures", assignmentCourse);
        Course<ResearchCourse> aiCourse = new Course<>("Artificial Intelligence Research", researchCourse);

        catalog.addCourse(mathCourse);
        catalog.addCourse(csCourse);
        catalog.addCourse(aiCourse);

        List<Course<? extends CourseType>> courses = catalog.getCourses();
        assertEquals(3, courses.size());

        assertEquals("Mathematics 101", courses.get(0).getCourseName());
        assertEquals("Exam based Course", courses.get(0).getCourseType().getName());

        assertEquals("Data Structures", courses.get(1).getCourseName());
        assertEquals("Assignment Course", courses.get(1).getCourseType().getName());

        assertEquals("Artificial Intelligence Research", courses.get(2).getCourseName());
        assertEquals("Research based Course", courses.get(2).getCourseType().getName());
    }

    @Test
    void testEvaluationMethods() {
        assertEquals("Evaluation via final exams", examCourse.getEvaluationMethod());
        assertEquals("Evaluation via periodic assignment", assignmentCourse.getEvaluationMethod());
        assertEquals("Evaluation via research projects", researchCourse.getEvaluationMethod());
    }

    @Test
    void testCourseToString() {
        Course<ExamCourse> mathCourse = new Course<>("Mathematics 101", examCourse);
        assertEquals("Mathematics 101 (Exam based Course) - Evaluation via final exams", mathCourse.toString());

        Course<AssignmentCourse> csCourse = new Course<>("Data Structures", assignmentCourse);
        assertEquals("Data Structures (Assignment Course) - Evaluation via periodic assignment", csCourse.toString());

        Course<ResearchCourse> aiCourse = new Course<>("Artificial Intelligence Research", researchCourse);
        assertEquals("Artificial Intelligence Research (Research based Course) - Evaluation via research projects", aiCourse.toString());
    }
}