package com.mealplangenerator;

public class VeganMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegan Meal";
    }

    @Override
    public boolean isValidMeal() {
        return true;
    }
}