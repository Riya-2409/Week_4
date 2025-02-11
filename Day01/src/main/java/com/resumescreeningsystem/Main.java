package com.resumescreeningsystem;

public class Main {
    public static void main(String[] args) {
        SoftwareEngineer se = new SoftwareEngineer();
        DataScientist ds = new DataScientist();
        ProductManager pm = new ProductManager();

        Resume<SoftwareEngineer> resume1 = new Resume<>("Alice", "Experienced in Java and Python.", se);
        Resume<DataScientist> resume2 = new Resume<>("Bob", "Expert in Machine Learning and Data Analysis.", ds);
        Resume<ProductManager> resume3 = new Resume<>("Charlie", "Strong background in Product Strategy and Roadmap.", pm);
        Resume<SoftwareEngineer> resume4 = new Resume<>("Dave", "Worked on HTML and CSS only.", se);

        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();
        screeningSystem.addResume(resume1);
        screeningSystem.addResume(resume2);
        screeningSystem.addResume(resume3);
        screeningSystem.addResume(resume4);

        screeningSystem.displayScreenedResumes();

        ResumeScreeningSystem.evaluateResume(se, "C++ and Python skills.");
        ResumeScreeningSystem.evaluateResume(ds, "Experienced in SQL but no ML background.");
    }
}
