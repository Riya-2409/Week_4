package com.queueinterface.hospitaltriagesystem;

// Class representing a patient
class Patient {
    String name;
    int severity;


    // Constructor
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }


    // Override toString() to display patient details
    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

