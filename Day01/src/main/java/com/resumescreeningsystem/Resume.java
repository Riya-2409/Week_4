package com.resumescreeningsystem;

public class Resume<T extends JobRole> {
    private String candidateName;
    private String resumeContent;
    private T jobRole;

    public Resume(String candidateName, String resumeContent, T jobRole) {
        this.candidateName = candidateName;
        this.resumeContent = resumeContent;
        this.jobRole = jobRole;
    }

    public boolean isSuitable() {
        return jobRole.evaluateResume(resumeContent);
    }

    @Override
    public String toString() {
        return "Candidate: " + candidateName + " | Role: " + jobRole.getRoleName();
    }
}