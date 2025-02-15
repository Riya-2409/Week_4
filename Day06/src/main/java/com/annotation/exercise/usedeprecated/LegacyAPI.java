package com.annotation.exercise.usedeprecated;

public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature: This method is deprecated.");
    }

    public void newFeature() {
        System.out.println("New feature: Use this method instead.");
    }
}
