package com.mealplangenerator;

public class KetoMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Keto Meal";
    }

    @Override
    public boolean isValidMeal() {
        return true;
    }
}