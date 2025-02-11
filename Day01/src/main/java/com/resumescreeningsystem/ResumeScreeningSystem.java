package com.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    private List<Resume<? extends JobRole>> screenedResumes = new ArrayList<>();

    public void addResume(Resume<? extends JobRole> resume) {
        if (resume.isSuitable()) {
            screenedResumes.add(resume);
            System.out.println("Resume Approved: " + resume);
        } else {
            System.out.println("Resume Rejected: " + resume);
        }
    }

    public void displayScreenedResumes() {
        System.out.println("\nFinal Approved Resumes:");
        for (Resume<? extends JobRole> resume : screenedResumes) {
            System.out.println(resume);
        }
    }

    // Generic method to evaluate a resume dynamically
    public static <T extends JobRole> void evaluateResume(T jobRole, String resumeContent) {
        System.out.println("\nEvaluating resume for " + jobRole.getRoleName() + "...");
        if (jobRole.evaluateResume(resumeContent)) {
            System.out.println("Resume is suitable!");
        } else {
            System.out.println("Resume does not match the job role.");
        }
    }
}