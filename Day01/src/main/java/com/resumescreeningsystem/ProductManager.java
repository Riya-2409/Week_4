package com.resumescreeningsystem;

public class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public boolean evaluateResume(String resumeContent) {
        return resumeContent.toLowerCase().contains("product strategy") || resumeContent.toLowerCase().contains("roadmap");
    }
}