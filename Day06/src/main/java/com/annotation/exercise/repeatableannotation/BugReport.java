package com.annotation.exercise.repeatableannotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class) // Allows multiple applications
@interface BugReport {
    String description();
}
